package csv;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opencsv.CSVReader;

public class CsvReader {

	public static void main(String[] args) {

		CSVReader reader = null;  
		try  
		{  FileWriter fw=new FileWriter("E:\\Movies\\JAVA Videos\\csvfile\\test.csv");  
			//parsing a CSV file into CSVReader class constructor  
			reader = new CSVReader(new FileReader("E:\\Movies\\JAVA Videos\\csvfile\\Sample5.csv"));  
			String [] nextLine;  
			//reads one line at a time  
			while ((nextLine = reader.readNext()) != null)  
			{  
				for(String token : nextLine)  
				{  
					//System.out.print(token+", ");  
					Matcher m = Pattern.compile("\\s*(?:\"[^\"]*\"|(?:^|(?<=,))[^,]*)").matcher(token);
					while (m.find()) {
						  System.out.print(m.group().replaceAll("^\\s*\"?\\s*(.*?)\\s*\"?\\s*$", "$1")+"|");
						  fw.write(m.group().replaceAll("^\\s*\"?\\s*(.*?)\\s*\"?\\s*$", "$1")+"|"); 
					}	
					
				}  
				System.out.print("\n");  
				fw.write("\n");    
			}  
			fw.close();    
		}  
		catch (Exception e)   
		{  
		e.printStackTrace();  
		}  
		 
	}

}
