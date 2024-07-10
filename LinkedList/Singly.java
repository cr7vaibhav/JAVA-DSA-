package LinkedList;

class Node {
    int data;
    Node next;
    // next node will be of type node itself since it will refer to next Node
}

class LinkedList {
    Node head;// refers to the first node

    public void insert(int data) {
        Node node = new Node(); // creating a new node object of Node
        node.data = data;
        node.next = null;
        // since this new node is getting added at the end then the address of next node
        // is null

        if (head == null) {
            head = node;
            // if the linked list is empty the head is null you are adding the first element
        } else {
            // we make the new node head since we dont know where the last value is so we
            // iterate through the linked list to get to the last value which will have next
            // as null
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head; // next of this node will refer to prev head
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println(n1.data + " deleted at index " + index);

        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {// this is how u traverse a linked list
            System.out.println(node.data);
            node = node.next; // this is how you shift
        }
        System.out.println(node.data);// last elemnent we have to print outside the loop
    }
}

public class Singly {
    public static void main(String[] args) {

        LinkedList li = new LinkedList();
        li.insert(3);
        li.insert(6);
        li.insert(5);
        li.insertAtStart(9);
        li.insertAt(0, 72);
        li.insertAt(2, 7);
        li.insertAtStart(8);
        li.show();
        li.deleteAt(3);
        li.show();

    }
}
