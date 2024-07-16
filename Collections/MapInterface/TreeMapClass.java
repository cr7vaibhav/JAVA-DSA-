package Collections.MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        // no null keys but multiple null values
        //maintains order
        
        tm.put("A", 1);
        tm.put("C", 3);
        tm.put("B", 2);
        tm.put("F", 1);
        tm.put("E", 3);
        tm.put("G", 2);

        System.out.println(tm);

        int valueA = tm.get("A");// gets value based on key
        System.out.println(valueA);

        for (String key : tm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + tm.get(key));

        }

        TreeMap<String, Integer> tm2 = new TreeMap<>();
        tm2.put("A", 1);
        tm2.put("C", 3);
        tm2.put("B", 2);
        tm2.put("F", 1);
        tm2.put("E", 3);
        tm2.put("G", 2);

        System.out.println("tm == tm2  "+ tm.equals(tm2));


    }
}
