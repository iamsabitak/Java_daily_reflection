package JavaDocs;

@FunctionalInterface
interface myFunctionalInteface{
void thisMethods();
// void thisMethods1();
}
class Phone{
public void showTime(){
System.out.println("Time is 6:11 PM");
}
public void on(){
System.out.println("Turning on phone");
}
}
class Smartphone extends Phone{
public void  ring(){
    System.out.println("Phone is ringing");
}
public void call(){
    System.out.println("Calling someone");
}
@Override
public void on(){
    System.out.println("Turning on the SmartPhone");
}
@Override
public void showTime(){
    System.out.println("Time is 8 PM");
}
@Deprecated
public int sum(int a, int b){
    return a+b;
}
}
public class java_annotation {
    public static void main(String[] args) {
        @SuppressWarnings( "deprecation" )
        Smartphone phone = new Smartphone();
        phone.showTime();
        phone.sum(2,2);
    }
}
