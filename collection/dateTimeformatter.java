package collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeformatter {
   public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.now() ;// This is the date
       System.out.println(dt);
  
       DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");//// This is the format
String myDate = dt. format (df); //// Creating date string using date and format.
System.out.println (myDate);
DateTimeFormatter df2 = DateTimeFormatter. ISO_LOCAL_DATE;
String mydate = dt. format (df2); // Creating date string using date and format
System.out.println(mydate);
   } 
}
