

package thread;
/* Q-1 Write a program to print "Good morning" and "Welcome" 
continuously on the screen in Java using threads.*/

class Practice1 extends Thread{
  @Override
  public void run(){
    int i = 0;
    while(i<1000){
    System.out.println("Good Morning");
  }
  }
}
class Practice2 extends Thread{
  @Override
  public void run(){
    int i = 0;
    while(i<1000){
    System.out.println("Welcome");
  }
}
}
public class Practice_01 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Practice1 set1 = new Practice1();
      set1.start();
      Practice2 set2 = new Practice2();
      set2.start();
  }
}