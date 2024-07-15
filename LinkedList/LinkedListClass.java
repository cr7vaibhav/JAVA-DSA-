package LinkedList;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        
        LinkedList<Integer> ls =new LinkedList<>();

        ls.add(2);
        ls.add(4);
        ls.add(6);
        ls.add(8);
        ls.add(1);
        ls.add(2, 34);
        System.out.println(ls);

        ls.remove(4);
        ls.removeFirst();
        ls.removeLast();
        System.out.println(ls);
    }
}
