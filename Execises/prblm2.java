package Execises;

public class prblm2 {
    // Create an interface TVremote and use it to inherit
// another interface smart TVremote.

    public static void main(String[] args) {
      System.out.println("Hello, World!");
      SmartTVremote ss = new SonnyHDTVremote();//can call SmartTVremote methods only
      ss.connect1();
      TVremote cc =new SonnyHDTVremote();//can call  TVremote methods only
      cc.disconnect();
      SonnyHDTVremote tv = new SonnyHDTVremote();//can all methodds 
      tv.connect();
  }
}
interface TVremote{
  void connect();
  void disconnect();
  
}
interface SmartTVremote extends TVremote{
  public void connect1();
     public void disconnect2();
    }
class SonnyHDTVremote implements SmartTVremote{
 public  void connect(){
    System.out.println("hey");
  }
 public  void disconnect(){
     System.out.println("Hello");
  }
 public  void connect1(){
     System.out.println("namsate");
  }
  public void disconnect2(){
     System.out.println("gm");
  }
}


