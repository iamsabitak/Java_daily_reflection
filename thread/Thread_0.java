
package thread;
public class Thread_0 {
    public static void main(String[] args) {
      System.out.println("extending in class");
      Thread1 t1 = new Thread1();
     t1.start();
      Thread2 t2 = new Thread2();
      t2.start();
      
  }
}

//by extending the thread in class
class Thread1 extends Thread{
  public void run(){
    int i = 0;
    while(i<300){
    System.out.println("the cat is running");
      i++;
    }
  }
}
class Thread2 extends Thread{
  public void run(){
    int i = 0;
    while(i<300){
    System.out.println("the cat is not running");
    i++;
    }
  }
}