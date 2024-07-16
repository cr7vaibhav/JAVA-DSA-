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
    public void put(K key ,V value){
        int bucketIndex=getBucketIndex(key);
        Node<K,V> head =buckets[bucketIndex]; // get the head of the linked list in the bucket index


    //check if the key is already present in the linked list TODO
    while (head != null) {
        if (head.key.equals(key)) {
            head.value = value; // Update the value if the key is found
            return;
        }
        head = head.next; // Move to the next node in the chain
    }

    // Insert the new key-value pair
    size++; // Increment the size of the hash table
    head = buckets[bucketIndex]; // Get the head of the linked list again
    Node<K, V> newNode = new Node<>(key, value); // Create a new node with the key-value pair
    newNode.next = head; // Set the next of the new node to the current head
    buckets[bucketIndex] = newNode; // Set the new node as the head of the linked list

    // Resize the hash table if the load factor exceeds 0.7
    if ((1.0 * size) / capacity >= 0.7) {
        resize();
    }
}

// Method to retrieve the value for a given key
public V get(K key) {
    int bucketIndex = getBucketIndex(key); // Get the bucket index for the key
    Node<K, V> head = buckets[bucketIndex]; // Get the head of the linked list at the bucket index

    // Search the linked list for the key
    while (head != null) {
        if (head.key.equals(key)) {
            return head.value; // Return the value if the key is found
        }
        head = head.next; // Move to the next node in the chain
    }

    // Return null if the key is not found
    return null;
}

// Method to remove a key-value pair from the hash table
public V remove(K key) {
    int bucketIndex = getBucketIndex(key); // Get the bucket index for the key
    Node<K, V> head = buckets[bucketIndex]; // Get the head of the linked list at the bucket index
    Node<K, V> prev = null; // Initialize the previous node as null

    // Search the linked list for the key
    while (head != null) {
        if (head.key.equals(key)) {
            break; // Break the loop if the key is found
        }
        prev = head; // Move the previous node to the current node
        head = head.next; // Move to the next node in the chain
    }

    // Return null if the key is not found
    if (head == null) {
        return null;
    }

    // Remove the key-value pair
    size--; // Decrement the size of the hash table
    if (prev != null) {
        prev.next = head.next; // Remove the node from the linked list
    } else {
        buckets[bucketIndex] = head.next; // Set the head to the next node if removing the first node
    }

    return head.value; // Return the value of the removed node
}

// Method to return the number of key-value pairs in the hash table
public int size() {
    return size;
}

// Method to check if the hash table is empty
public boolean isEmpty() {
    return size == 0;
}

@SuppressWarnings("unchecked")
private void resize() {
    Node<K, V>[] temp = buckets; // Store the current buckets array
    capacity = 2 * capacity; // Double the capacity
    buckets = new Node[capacity]; // Create a new buckets array with the new capacity
    size = 0; // Reset the size

    // Rehash all the keys
    for (Node<K, V> headNode : temp) {
        while (headNode != null) {
            put(headNode.key, headNode.value); // Insert each key-value pair into the new buckets array
            headNode = headNode.next; // Move to the next node in the chain
        }
    }
}

public static void main(String[] args) {
    HashTable<String, Integer> hashTable = new HashTable<>(5);

    hashTable.put("One", 1); // Insert key "One" with value 1
    hashTable.put("Two", 2); // Insert key "Two" with value 2
    hashTable.put("Three", 3); // Insert key "Three" with value 3
    hashTable.put("Four", 4); // Insert key "Four" with value 4

    System.out.println("Size of hash table: " + hashTable.size()); // Print the size of the hash table
    System.out.println("Value for key 'One': " + hashTable.get("One")); // Get and print value for key "One"
    System.out.println("Value for key 'Two': " + hashTable.get("Two")); // Get and print value for key "Two"

    hashTable.remove("Two"); // Remove key "Two" from the hash table
    System.out.println("Size of hash table after removing key 'Two': " + hashTable.size()); // Print the size after removal
    System.out.println("Value for key 'Two' after removal: " + hashTable.get("Two")); // Try to get value for removed key "Two"
}
}

    }
}
