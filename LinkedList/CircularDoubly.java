package LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}

class Dbcir {
    Node head = null;
    Node tail = null;

    public void add(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }

        tail = (head).prev;
        // finds last node

        // Create Node Dynamically
        Node newNode = new Node(data);

        // Head is going to be next of new node
        newNode.next = head;

        // make new node prev of (head)
        (head).prev = newNode;

        // tail is prev pf new node
        newNode.prev = tail;
        tail.next = newNode;

    }

    public void addAfter(Node n, int data) {
        if (head == null) {
            Node newNode = new Node(data);
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }

        tail = (head).prev;
        // finds last node

        // Create Node Dynamically
        Node newNode = new Node(data);

        newNode.next = n.next;

        n.next.prev = newNode;

        newNode.prev = n;
        n.next = newNode;

    }

    public void addAtIndex(int index, int data) {
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }

        tail = (head).prev;
        // finds last node

        // Create Node Dynamically
        Node newNode = new Node(data);

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n0 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n0 = n.next;//this is getting deleted
            n.next = n0.next;
            n.next.prev=n;
            System.out.println(n0.data + " deleted at index " + index);
        }
    }

    public void showForward(Node data) {
        Node current = data;
        if (data == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("Forward traverse circular doubly linked list");
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current.next != data);
            System.out.println(current.data);
        }
    }

    public void showBackward(Node data) {
        Node current = data;
        if (data == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("Backward traverse circular doubly linked list");
            do {
                System.out.print(current.data + " -> ");
                current = current.prev;
            } while (current.prev != data);
            System.out.println(current.data);
        }
    }
}

public class CircularDoubly {
    public static void main(String[] args) {
        Dbcir dc = new Dbcir();
        dc.add(4);
        dc.add(6);
        dc.add(12);
        dc.add(3);
        dc.add(1);
        dc.showForward(dc.head);
        dc.showForward(dc.tail);
        dc.showBackward(dc.tail);
        dc.showBackward(dc.head);
        dc.addAfter(dc.head.next.next, 27);
        dc.showForward(dc.head);
        dc.addAtIndex(3, 66);
        dc.showForward(dc.head);
        dc.showBackward(dc.tail);
        dc.addAtIndex(4, 92);
        dc.showForward(dc.head);
        dc.showBackward(dc.tail);
        dc.deleteAtIndex(3);
        dc.showForward(dc.head);
        dc.showBackward(dc.tail);
    }
}
