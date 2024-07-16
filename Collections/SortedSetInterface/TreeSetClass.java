package Collections.SortedSetInterface;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("For");
        System.out.println(ts);

        String check = "Geeks";
        System.out.println(ts.contains(check));// returns true/false
        System.out.println(ts);

        String val = "For";
        System.out.println(ts.higher(val));// greater than or less than the current value
        System.out.println(ts.lower(val));

        System.out.println(ts.pollFirst());// removes first element
        ts.pollLast();
        ts.remove(val);

        System.out.println(ts);
        // stores data in ascending order
        // no duplicates

    }
}
