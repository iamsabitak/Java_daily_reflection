package Execises;

public class prblm5 {
    //Create a class telephone with ( ) , lift ( ) anddisconnected ( ) 
// methods as abstract methods create another class smart telephone 
// and demonstrate polymorphism .
     public static void main(String[] args) {
 Cellphone sk = new SmartTelephone();
sk.connect();
Telephone bk = new SmartTelephone();
bk.disconnected();
 }
}
abstract class Telephone {
  abstract void lift();
   abstract void disconnected();
   
}
interface Cellphone{
  void connect();
  void ring();
}

class SmartTelephone extends Telephone implements Cellphone{
   public void lift(){
     System.out.println("lifting..");
   }
 public void disconnected(){
    System.out.println("disconnecting");
  }
  public void connect(){
     System.out.println("connecting..");
   }
 public void ring(){
    System.out.println("ringing");
  }
  public void call(){
    System.out.println("calling");
  }
 
 
}
