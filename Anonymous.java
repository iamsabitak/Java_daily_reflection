interface DemoAno{
    void meth1();
    void meth2();
}
class AnonyDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }
@Override
public void meth1(){
System.out.println("Hey This is Meth1");
}
@Override
public void meth2(){
    System.out.println("Hye This is Meth2");
}
}
public class Anonymous {
    public static void main(String[] args) {
        AnonyDemo t1 = new AnonyDemo();
        t1.meth1();
        t1.meth2();
        DemoAno t2 = new DemoAno() {
            @Override
public void meth1(){
System.out.println("Hey This is  DEMOANO  Meth1");
}
@Override
public void meth2(){
    System.out.println("Hye This is DEMOANO Meth2");
        }
        };
        t2.meth1();
  }
}
