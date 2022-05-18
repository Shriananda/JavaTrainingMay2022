package practicingAfterWatchingCode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiWriter {

	public static void main(String[] args) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("SampleTest1");

		Map<String, Object[]> dataSet = new TreeMap<String, Object[]>();
		dataSet.put("1", new Object[] { "ID", "Name", "Company" });
		dataSet.put("2", new Object[] { "1", "Shri", "CTS" });
		dataSet.put("3", new Object[] { "2", "Shri", "USA" });
		dataSet.put("4", new Object[] { "3", "Anand", "Oracle" });
		dataSet.put("5", new Object[] { "4", "Anand", "Amazon" });
		dataSet.put("6", new Object[] { "5", "Padhu", "Google" });
		dataSet.put("6", new Object[] { "5", "Padhu1", "Google" });

		Set<String> set = dataSet.keySet();
		int rowNum = 0;

		for (String key : set) {
			Row row = sheet.createRow(rowNum++);
			Object[] data = dataSet.get(key);
			int cellNum = 0;
			for (Object value : data) {
				Cell cell = row.createCell(cellNum++);
				if (value instanceof String) {					
					cell.setCellValue((String)value);
				}
				if (value instanceof Integer) {					
					cell.setCellValue((Integer)value);
				}
			}
		}
		
		try {
			FileOutputStream out = new FileOutputStream("SampleTest1.xlsx");
			wb.write(out);
			wb.close();
			System.out.println("written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
