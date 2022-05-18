package csv;

import java.io.FileReader;
import java.io.FileWriter;

import com.opencsv.CSVReader;



public class CsvReader1 {

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
					System.out.println("here");
					System.out.print(token+", ");  
						fw.write(token+", "); 
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
