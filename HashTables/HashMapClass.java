package HashTables;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    // ds that stores unique keys to values
    // Each kry.vakue pair is known as Entry
    // Fast insertion, lookup, deletion of key/value pairs
    // not ideal for small data sets

    // hashing = takes a key and computes an integer (fornula will vary based on key
    // and data type)
    // in Hash table we use hash % capacity to calculate an index number
    // key.hashcode()% capacity =index

    // bucket = an index storage location for one or more Entries can store multiple
    // entries in case of collision (Linked simlarly a linked list)

    // collison the has function generates same index for more than one key , less
    // collisions more efficient

    // Runtime complexity Best :O(1) worst: O(n)
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(100, "Spongebob");
        h.put(123, "Patrick");
        h.put(321, "Sandy");
        h.put(555, "Squidward");
        h.put(777, "Gary");

        System.out.println(h);

        System.out.println(h.hashCode());

        for (Integer key : h.keySet()) {
            System.out.println("Hashcode: " + key.hashCode() + ", Key: " + key + ", Value: " + h.get(key));
        }

        for (Map.Entry<Integer, String> entry : h.entrySet()) {
            System.out.println(
                    "HashCode :" + entry.hashCode() % 10 + ", Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println(h.get(321));
    }
}
