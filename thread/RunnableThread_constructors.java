package thread;
public class RunnableThread_constructors {
    public static void main(String[] args) {
      System.out.println("implements in interface");
      Runnable1 r1 = new Runnable1("niru");
      Thread tt1 = new Thread(r1);
      tt1.start();
      tt1.setName("janaki");
      Runnable1 r2 = new Runnable1("nabin");
       Thread tt2 = new Thread(r2);
       tt2.setName("nilam");
        System.out.println("the id is "+tt1.getId());
       System.out.println("the id is " + tt2.getId());
     System.out.println("the name is" +tt1.getName());
     System.out.println("the name is " +tt2.getName());
  }
}

//by implementing the thread in interface
class  Runnable1 implements Runnable{
  public Runnable1(String name){
    System.out.println(name);
     //super(name); <--throws an error
  }
  public void run(){
    // int i = 0;
    // while(i<300){
    System.out.println("I am a thread.");
      // i++;
    }
  }

