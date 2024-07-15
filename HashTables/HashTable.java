package HashTables;

class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

}

public class HashTable<K, V> {
    private Node<K, V>[] buckets; // Array of linked list buckets for sepreate chaning
    private int capacity; // Capacity of the hash table
    private int size; // no of key value pairs

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity; // initail capacity
        this.buckets = new Node[capacity]; // instailize buckets array
        this.size = 0;// intialize size of hash table
    }

    // method to calculate index of a given key
    private int getBucketIndex(K key) {
        int hashcode = key.hashCode(); // gets hashcode of tge key
        return Math.abs(hashcode) % capacity; // calculates the index using modulus operation
    }

    //Method to insert keyvalue pair into the hash table

}
