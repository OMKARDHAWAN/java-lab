package self_learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;



public class DateManipulator {
  public static void main(String[] args) {
   try {
	   String dateString = "15/04/2026";
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	   Date date = sdf.parse(dateString);
	   System.out.println("Date :" + date);
	   

	   LocalDate d = LocalDate.of(2026,1,5);

	   DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

	   String date2 = d.format(formatter);
	   System.out.println("String date is :" + date2);
	   
	   LocalDate date3 = LocalDate.of(2026, 05, 10);
	   LocalDate date4 = LocalDate.of(2026, 5, 5);
	   int day = date3.getDayOfMonth() - date4.getDayOfMonth();
	   System.out.println("Difference of days between two date is :" + day);
	   
	   
   }catch(ParseException P){
	   System.out.println("Exception :" + P);
   }
	  
  }

 
}
