public class Try {
    public static void main(String[] args) {
        int a = 6000;
int b = 0;
//  Without Try:
// int c = a / b;
// System.out.println("The result is " + c) ;
try {
   int c = a / b;
 System.out.println("The result is " + c) ; 
} 
catch (Exception e) {
    System.out.println("We failed to divide. Reason: ");
 System.out.println(e);
    }
System.out.println("The end of the program");
    }
}

