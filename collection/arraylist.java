package collection;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>();
        ArrayList <Integer> l3 = new ArrayList<>();
        l2.add(19);
        l2.add(14);
        l2.add(15);
        l2.add(5);

        l1.add(9);
        l1.add(4);
        l1.add(5);
        // l1.add(0,7);//start from 7 coz elements index is 0
        l1.add(7);
        l1.addAll(l2);
        l1.set(0,678);//set the new element

  System.out.println(l3.isEmpty()); //-->return false if his list does not conatain any elements.
        //l1.removeAll(l2);  //-->will remove all element of l2.
     //l1.retainAll(l2); //-->remove all elements from l1 that are not present in l2.
        // l1.clear(); //--> will clear the list 
        System.out.println(l1.indexOf(4)); 
        System.out.println(l1.lastIndexOf (5));
for (int i =0;i<l1.size();i++){
    System.out.print(l1.get(i));
    System.out.print(','); 
    
}
System.out.println(l1.contains(9 ));
    }
}
