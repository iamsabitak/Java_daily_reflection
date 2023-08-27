package thread;
//by implementing the Thread in interface
class Runnable1 implements Runnable{
  public void run(){
    int i = 0;
    while(i<=10) {
    System.out.println("i am happy");
    i++;
    }
    
  }
}
class Runnable2 implements Runnable{
  public void run(){
    int i = 0;
    while(i<=10){
    System.out.println("i am sad");
    i++;
    }
    
  }
}
public class Runnable_01{
  public static void main(String[] args){
      System.out.println("implements in interface");
      Runnable1 r1 = new Runnable1();
      Thread tt1 = new Thread(r1);
      tt1.start();
      Runnable2 r2 = new Runnable2();
       Thread tt2 = new Thread(r2);
      tt2.start();     
  }
}