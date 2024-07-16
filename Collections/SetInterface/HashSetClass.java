package Collections.SetInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {

        // no duplicate data
        // HashSet is used for avoiding duplicate data and to find value with the fast
        // method.
        HashSet<ArrayList> hs = new HashSet<>();

        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<String> l2 = new ArrayList<>();

        l1.add(121);
        l1.add(321);
        l2.add("spongebob");
        l2.add("squidward");

        hs.add(l1);
        hs.add(l2);
        hs.add(l2);

        System.out.println(hs.size());
        System.out.println(hs);

    }

}
