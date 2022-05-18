package datePackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
		System.out.println("Today date: "+date);   
		
		String d = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(d);
		
		 int dateint= 	Integer.parseInt(d.split("-")[0]);
		 int monthint= 	Integer.parseInt(d.split("-")[1]);
		 int yearint= 	Integer.parseInt(d.split("-")[2]);
		
		 System.out.println(dateint);
		 System.out.println(monthint);
		 System.out.println(yearint);
		 System.out.println();
		 System.out.println("try");
		 System.out.println(date.getYear());
		 //System.out.println(date.getMonth());
		 System.out.println(date.getDayOfMonth());
		 System.out.println(date.getMonthValue());
		 
		// Runtime.getRuntime().
		 System.out.println("version: "+Runtime.class.getPackage().getImplementationVersion());
		 
	}

}
 