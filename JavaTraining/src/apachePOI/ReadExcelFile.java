package apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) {

		try {
			FileInputStream readFile = new FileInputStream("SampleTest.xlsx") ;
			XSSFWorkbook wb = new XSSFWorkbook(readFile);
			
			XSSFSheet sheet = wb.getSheet("SampleSheet") ;
			Row row;
			Cell cell;
			
			Iterator<Row> rowIterator = sheet.iterator();
				while(rowIterator.hasNext()){
					row = rowIterator.next();
					Iterator<Cell> cellIterator = row.cellIterator();
					
					while(cellIterator.hasNext()){
						cell = cellIterator.next();
						DataFormatter formatter = new DataFormatter();
						String text = formatter.formatCellValue(cell);
						System.out.print (text+" ");
					}
					System.out.println();
				}
			
			
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
