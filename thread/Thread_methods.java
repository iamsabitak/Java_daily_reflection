package thread;
public class Thread_methods {
    public static void main(String[] args) {
      System.out.println("extending in class");
      Thread1 t1 = new Thread1();
      t1.setName("Kyōdai");
       Thread2 t2 = new Thread2();
       t2.setName("Xiōngdì");
      t1.start();
      // try 
      // {
      //   t1. join();//to  call complete method of t1
      // }
      // catch (Exception e){
      //   System.out.println(e);
      // }
        t2.start();
         }
      }

class Thread1 extends Thread{
  // public Thread1(String name){
  //   super(name);
  //   System.out.println(name);
  // }
  public void run(){
    int i = 0;
    while(i<=1000){
    System.out.println("Arigatō " +getName());
    try {
    Thread. sleep (455);//it will stop this meth for some sec
     } catch (InterruptedException e) {
       System.out.println(e);
     }
       i++;
    }
  }
}
class Thread2 extends Thread {
  public void run(){
    int i = 0;
    while(i<=1000){
    System.out.println("Xièxiè " +getName());
       i++;
    }
  } 
  
}
  
 