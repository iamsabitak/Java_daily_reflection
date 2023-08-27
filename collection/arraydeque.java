package collection;

import java.util.*;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> s1 = new ArrayDeque<>();
        s1.add(2);
        s1.add(3);
        s1.add(28);
        s1.addFirst(12);
        System.out.println(s1.getFirst());
        System.out.println(s1.getLast());
    }
}
