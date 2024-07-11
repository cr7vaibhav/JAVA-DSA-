package LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }

}

class Circlell {
    Node head = null;
    Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // if list empty both head and tail will point to new Node
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }

    public void show(Node data) {
        Node current = data;
        if (data == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("Nodes of circular singly linked list");
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current.next != data);
            System.out.println(current.data);
        }
    }

}

public class CircularSingly {
    public static void main(String[] args) {
        Circlell cl =new Circlell();
        cl.add(4);
        cl.add(6);
        cl.add(12);
        cl.add(3);
        cl.add(1);
        cl.show(cl.head);
        cl.show(cl.head.next.next.next);
        

    }
}
