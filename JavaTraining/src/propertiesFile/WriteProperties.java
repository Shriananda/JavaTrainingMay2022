package propertiesFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		OutputStream writeFile = null;
		
		try{
			writeFile = new FileOutputStream("config.properties");
			 prop.setProperty("DBServer", "in.o.anand") ;
			 prop.setProperty("DBName", "anand") ;
			 prop.setProperty("username", "anand") ;
			 prop.setProperty("pwd", "anand") ;
			
			 prop.store(writeFile, "sample comments");
			 System.out.println("Create properties successfully");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			if(writeFile != null){
				try {
					writeFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
