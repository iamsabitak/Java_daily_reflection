package collection;

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();

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
        //this methods doesnot work in arraylist
        l1.addFirst(8790); //add the element in the first
        l1.addLast(7999);  //add the element in the last
        // l1.set(0,678);//set the new element

  System.out.println(l3.isEmpty()); //-->return false if his list does not conatain any elements.

        //  l1.clear(); //--> will clear the list 
        System.out.println(l1.indexOf(4)); 
        System.out.println(l1.lastIndexOf (5));
for (int i =0;i<l1.size();i++){
    System.out.print(l1.get(i));
    System.out.print(','); 
    }
System.out.println(l1.contains(9));
}
}
