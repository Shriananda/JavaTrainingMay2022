package practicingAfterWatchingCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream inStream = null ;
		try {
			inStream = new FileInputStream("config1.properties") ;
			prop.load(inStream);
			System.out.println(prop.getProperty("Name"));
			System.out.println(prop.getProperty("Married"));
			System.out.println("Read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
