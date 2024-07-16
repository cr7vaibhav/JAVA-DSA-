package Collections.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        //no duplicate keys but duplicate values
        //null key only once but multiple null values
        //unsyncronized

        //doesnt maintain order
        hm.put(51, "For");
        hm.put(24, "For");
        hm.put(11, "Geeks");
        hm.put( null,"Geeks");
        hm.put(7, "Geeks");
        hm.put(31, "Geeks");
        hm.put(0, "Geeks");
        

        System.out.println(hm);

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        //iterates map

        //for comparing keys equals is used

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(51, "For");
        hm2.put(24, "For");
        hm2.put(11, "Geeks");
        hm2.put( null,"Geeks");
        hm2.put(7, "Geeks");
        hm2.put(31, "Geeks");
        hm2.put(0, "Geeks");

        System.out.println("hm==hm2   "+ hm.equals(hm2));//equals to compare two hashmaps
    }   
}
