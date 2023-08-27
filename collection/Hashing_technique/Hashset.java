package collection.Hashing_technique;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> A1 = new HashSet<>();
         A1.add(0);
         A1.add(1);
         A1.add(2);
         A1.add(3);
         A1.add(4);
         A1.remove(3);
         //A1.clear();
         System.out.println(A1);
         System.out.println("The size is of A1 is " +A1.size());
         
        
    }
}
