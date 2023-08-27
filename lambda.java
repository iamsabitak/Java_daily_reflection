@FunctionalInterface
interface lambdaFunc{
    void meth1();
    
}
// class myFunc implements lambdaFunc{
//     @Override
//     public void meth1(){
//         System.out.println("This is Method 1");
//     }
// }

public class Lambda {
    public static void main(String[] args) {
        // myFunc l1 = new myFunc();
        // l1.meth1();
        lambdaFunc l2 = ()-> {
System.out.println("I am method 1 from lambda expression");
        };
       l2.meth1(); 
    }
}
