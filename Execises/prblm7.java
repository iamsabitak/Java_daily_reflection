package Execises;
public class prblm7 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Child aa = new Child();
    //   System.out.println(aa.y);
    //     System.out.println(aa.x);
        aa.c1(2);
        aa.c2(3);
        aa.a();
        aa.a1();
        aa.name();
        aa.name1("Sabita");
        aa.greet1();
        String[] s = aa.names();
        for (String item:s){
          System.out.println(item);
        }
         String[] ar = aa.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
  }
}
interface Parent{
  int x = 10;
  void c1(int x);
     void c2(int y);
     private void greet(){
       System.out.println("aanihaau");
     }
     default void greet1(){//this is how we can use default method
       greet();
       System.out.println("hello");
     }
    }

interface Parent1{
  int y = 20;
   void a();
    void a1();
    String[] names();
     String[] getNetworks();
    
    }
    class Sabita{
      public void name(){
      System.out.println("hello i am Sabita");
    }
     public void name1(String name){
       System.out.println("hello i am Sabita having parameter");
    }
    }
    
class Child extends Sabita implements Parent1,Parent{
 @Override
  public void c1(int x){
  System.out.println("i am a method having parameter x");
  }
  @Override
  public void c2(int y){
     System.out.println("i am a method having parameter y");
  }
  @Override
  public void a(){
     System.out.println("i am a method a without parameter");
  }
@Override
  public void a1(){
    System.out.println("i am a method without a1 parameter");
  }
  public String[] names(){
    String[] a = {"sabu","niru","janki","nabin"};
      return a;
  }
      public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
  }
  @Override
   public void name(){
      System.out.println("hello i am sabitaaaaa");
    }
    @Override
     public void name1(String name){
      System.out.println("hello i am Sabitaaaaa having parameterrrrrr");
    }
  
}
