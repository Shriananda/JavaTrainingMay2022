package practicingAfterWatchingCode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) {

		Properties prop = new Properties();
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("config1.properties") ;
			prop.setProperty("Name", "Anand") ;
			prop.setProperty("Married", "YES") ;
			prop.setProperty("Age", "31") ;
			prop.setProperty("Sex", "Male") ;
			prop.store(out, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		finally{
			try {
				out.close();
				System.out.println("written");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
