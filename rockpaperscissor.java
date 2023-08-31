import java.util.*;

public class rockpaperscissor{
    public static void main(String[] args) {
      try (//0 for rock
            //1 for paper
            //2 for scissor
      Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number\n0 for rock\n1 for paper\n2 for scissor");
        int user = sc.nextInt();
        Random rd = new Random();
        int computer = rd.nextInt(3);
         
         if (user == computer){
           System.out.println("draw");
         }
         else if(user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1){
           System.out.println("You Win");
         }
         else {
           System.out.println("computer win");
         }
         if (computer==0){
           System.out.println("computer rock");
         }
                if (computer==1){
           System.out.println("computer paper");
         }
                if (computer==2){
           System.out.println("computer scissor");
         }
      }
    }
}

