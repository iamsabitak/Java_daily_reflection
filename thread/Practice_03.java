package thread;

/*Demonstrate gerPriority() and setPriority() methods in Java threads.*/
      class Animal1 extends Thread{
        @Override
        public void run(){
          System.out.println("Meow...Meow...Meow");
        }
      }
      class Animal2 extends Thread{
        @Override
        public void run(){
          int i = 0;
          while(i<10){
          System.out.println("Bow...Bow.....Bow");
        }
      }
      }
      public class Practice_03 {
   public static void main(String[] args) {
Animal1 cat = new Animal1();
            cat.start();
            cat.setPriority(5);
            Animal2 dog = new Animal2();
            dog.start();
            dog.setPriority(1);
            System.out.println(cat.getPriority());
            System.out.println(dog.getPriority());
            System.out.println(dog.getState());
        }
      }
      