package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        // provides dynamic array
        // ArrayList inherits AbstractList class and implements the List interface.
        // ArrayList is initialized by size. However, the size is increased
        // automatically if the collection grows or shrinks if the objects are removed
        // from the collection.
        // Java ArrayList allows us to randomly access the list.
        // ArrayList can not be used for primitive types, like int, char, etc. We need a
        // wrapper class for such cases.
        // ArrayList in Java can be seen as a vector in C++.
        // ArrayList is not Synchronized. Its equivalent synchronized class in Java is
        // Vector.

        ar.add("SpongeBob");
        ar.add("Sandy");
        ar.add("Squidward");
        ar.add("Partick");
        ar.add("Gary");

        System.out.println(ar);

        System.out.println(ar.size());

        for (String n : ar) {
            System.out.println(n);
        }

        System.out.println();
        @SuppressWarnings("rawtypes")
        Iterator itr = ar.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println(ar.get(2));

    }

}
