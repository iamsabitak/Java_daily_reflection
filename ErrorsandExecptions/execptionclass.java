import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
  class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class execptionclass {
    public static void main(String[] args) {
        int a;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number");
        a = sc.nextInt();
    }
    if (a < 9){
    try {
        throw new MyException();
        // throw new ArithmeticException ("This is an exception");
} catch (Exception e) {
    System.out.println (e.getMessage ());
System. out.println(e.toString());
System.out.println(e);
 e.printStackTrace();
 System.out.println("Finished");
}
System.out.println("Yes finished");
}
    try {
        //throw new MyException();
        throw new MaxAgeException();
        // throw new ArithmeticException ("This is an exception");
} catch (Exception e) {
    System.out.println (e.getMessage ());
System. out.println(e.toString());    
    }
//    try {
//         throw new MaxAgeException();
//         // throw new ArithmeticException ("This is an exception");
// } catch (Exception e) {
//     System.out.println (e.getMessage ());
// System. out.println(e.toString());
// } 
}
}
