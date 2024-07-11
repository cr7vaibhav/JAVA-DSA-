package LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}

class DoublyLl {
    Node head;
    Node tail;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        // make newnode head
        newNode.prev = null;
        // assign null to prev

        // now head is the second node as new node is prev of head
        if (head != null)
            head.prev = newNode;

        // head points to new node
        head = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertAfter(Node prevNode, int data) {
        // allocate mem and assign data to new node
        Node newNode = new Node(data);

        // set new node next to prev node next
        newNode.next = prevNode.next;

        // prev node next points to new node
        prevNode.next = newNode;

        // set prev of new node to the prevnode
        newNode.prev = prevNode;

        // set prev of newNode next to new node
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        Node temp = head;

        newNode.next = null;

        // if ll is empty
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        // if not empty traverse to the end of ll
        while (temp.next != null) {
            temp = temp.next;
        }
        // assign new node to tempnext
        temp.next = newNode;

        // assign prev of new node to temp
        newNode.prev = temp;

        // make the new node as tail
        tail = newNode;

    }

    public void deleteNode(Node del_node) {
        // if head or del_node is null not possible
        if (head == null || del_node == null) {
            System.out.println("List is empty or entered node is null");
            return;
        }

        // if del_node is head then point the head to next of del_node
        if (head == del_node) {
            head = del_node.next;
        }

        // if del_node is not the last node , the next node should point to the prev of
        // del_node
        if (del_node.next != null) {
            del_node.next.prev = del_node.prev;
        }

        // if del_node is not the first node then the previous node should point to
        // del_node next
        if (del_node.prev != null) {
            del_node.prev.next = del_node.next;
        }

        // if delete node is last node
        if (del_node.next == null) {
            tail = del_node.prev;
        }
    }

    public void showForward(Node node) {
        System.out.println("forward traverasal");
        while (node != null) {
            System.out.print(node.data + " -> ");

            node = node.next;
        }
        System.out.println();
    }

    public void showBackwards() {
        System.out.println("backwards traverasal");
        Node last = tail;
        // while (node != null) {
        // last=node;
        // node = node.next;
        // }
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println();
    }

    public void deleteAtIndex(int index) {
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
            n.next.prev=n;
            System.out.println(n1.data + " deleted at index " + index);
        }
    }

    public void insertAtIndex(int index, int data) {
        Node node = new Node(data);

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            node.prev = n;
            n.next = node;
            
            if (node.next == null) {
                tail = node;
            }

        }
    }

}

public class Doubly {
    public static void main(String[] args) {
        DoublyLl dl = new DoublyLl();

        dl.insertAtEnd(5);
        dl.insertAtEnd(9);
        dl.insertAtEnd(11);
        dl.insertAtEnd(23);
        dl.insertAtEnd(3);
        dl.showForward(dl.head);
        dl.insertAtStart(7);
        dl.showForward(dl.head);

        // insert after head
        dl.insertAfter(dl.head, 8);
        dl.showForward(dl.head);

        // insert after third node
        dl.insertAfter(dl.head.next.next, 69);
        dl.showForward(dl.head);

        // delete 2nd value
        dl.deleteNode(dl.head.next);
        System.out.println("Delete 2nd value");
        dl.showForward(dl.head);

        // delete 2nd last value
        dl.deleteNode(dl.tail.prev);
        System.out.println("Delete 2nd last value");
        dl.showForward(dl.head);

        // print backwards
        dl.showBackwards();

        // delete at index starts form 0
        dl.deleteAtIndex(2);
        dl.showForward(dl.head);
        dl.showBackwards();

        // insertion at index starts from 0
        dl.insertAtIndex(5, 77);
        dl.showForward(dl.head);
        dl.showBackwards();

    }

}
