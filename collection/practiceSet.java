package collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class practiceSet {
    public static void main(String[] args) {
        //Problem No 1
        ArrayList<String > ar = new ArrayList<>();
        ar.add("Student 1"); 
        ar.add("Student 2");
         ar.add("Student 3"); 
         ar.add("Student 4"); 
        ar.add("Student 5");
         ar.add("Student 6"); 
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object i : ar){
            System.out.println(i);
        }

        //Problem No 2
HashSet<Integer> s = new HashSet<>();
s.add (5);
s.add (6);
s.add (46); 
s.add (40);
s.add (49);
s.add (46);
System.out.println(s);

//Problem no 3
// Date d = new Date();
// System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

// Problem no 4
Calendar c = Calendar. getInstance ();
System.out.println(c.get (Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    
      //Problem no 5
      LocalDateTime dt = LocalDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); 
    String mydate = dt.format(df);
    System.out.println(mydate);
  }
}
