package thread;
/*Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms. */
class Practice1 extends Thread{
  @Override
  public void run(){
    try {
            Thread.sleep(200); //step method
    }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println("Good Morning");
  }
}
class Practice2 extends Thread{
  @Override
  public void run(){
    int i = 0;
    while(i <= 1000){
    System.out.println("Welcome");
  }
}
}
public class Practice_02{
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Practice1 set1 = new Practice1();
      set1.start();
      Practice2 set2 = new Practice2();
      set2.start();
  }
}