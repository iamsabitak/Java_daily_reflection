package collection;

import java.util.Calendar;
import java.util.TimeZone;

public class calendar_class {
    public static void main(String[] args) {
// Calendar c = Calendar.getInstance();
// System.out.println(c.getCalendarType());
// System.out.println(c.getTimeZone().getID());
Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
System.out.println(c.getCalendarType());
System.out.println(c.getTimeZone().getID());
    }
}
