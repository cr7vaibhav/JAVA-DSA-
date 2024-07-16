package Collections.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("SpongeBob");
        ll.add("Sandy");
        ll.add("Squidward");
        ll.add("Patrick");
        ll.add("Gary");

        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        ll.remove(2);
        System.out.println(ll);

        Iterator itr = ll.iterator();

        System.out.println();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(ll.get(1));
    }

}
