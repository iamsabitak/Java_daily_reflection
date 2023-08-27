public class throwvsthrows {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    } 
    public static int divide(int a, int b) throws ArithmeticException{
        // Made By Harry
        int result = a/b;
        return result; 
    }
    public static void main(String[] args) {
    try {
            // int x = divide(3, 0);
            // System.out.println(x);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            
            System.out.println("exception");
        }
    }
}
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}