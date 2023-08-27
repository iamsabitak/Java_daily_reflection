 package thread;
 public class thread_constructors {
    public static void main(String[] args) {
      System.out.println("extending in class");
      Thread1 t1 = new Thread1("sabita");
     t1.start();
      Thread1 t2 = new Thread1("nabin");
      t2.start();
      System.out.println("the name is "+t1.getName());
       System.out.println("the id is "+t1.getId());
        System.out.println("the name is " + t2.getName());
       System.out.println("the id is " + t2.getId());
  }
}

//by extending the thread in class
class Thread1 extends Thread{
  public Thread1(String name){
    super(name);
    // System.out.println(name);
  }
  public void run(){
    // int i = 0;
    // while(i<300){
    System.out.println("I am a thread.");
      // i++;
    }
  }

