package Execises;

public class prml1 {
   //Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods.Demonstrate polymorphism using monkey  class.
public static void main(String[] args) {
   // Human ss = new Human();
   // ss.eat();
   // ss.play();
   // ss.jump();
   // ss.sleep();
   // ss.bite();
    Monkey cc = new Human();
    cc.bite();
    cc.jump();
    BasicAnimal lovish = new Human ();
//lovish.speak(); <-- throw an error
lovish.eat();
   }
}
class Monkey{
 void bite(){
   System.out.println("biting bite bite");
 }
 void jump(){
   System.out.println("jumping jump jump");
 }
}

interface BasicAnimal{
 void eat();
 void sleep();
}
class Human extends Monkey implements BasicAnimal{
  public void bite(){
    System.out.println("biting");
  }
public  void jump(){
   System.out.println("jumping");
 }
 public void eat(){
   System.out.println("eating");
 }
 public void sleep(){
   System.out.println("sleeping");
 }
 public void play(){
   System.out.println("playing");
 }
}

