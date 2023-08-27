package collection;
import java.util. Date;
public class date_class {
    public static void main(String[] args) {
System.out.println(Long.MAX_VALUE);
System.out.println(System.currentTimeMillis());
        
Date d = new Date();
        System.out.println(d);
// System.out.println(new Date());
System.out.println(d.getTime());

    }
}


//quick quiz
/* Question: Is it safe to store the number of milliseconds in a variable of type long?
Answer: Yes, it is absolutely safe to store the number of milliseconds in a variable of type long because the maximum value that can be stored in long is 9223372036854775807. You can see that the maximum value of long is huge. Therefore, we do not need to worry about the value of milliseconds. Notice the output of the below code; the value of current time in millisecond is 10^6 times smaller than the maximum value of long data type.   

*/