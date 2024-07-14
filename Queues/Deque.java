package Queues;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class Deque {
    // double ended queue
    private Node front, rear;
    private int size;

    public Deque() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = null;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty .......");
            return Integer.MIN_VALUE;
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        System.out.println("Front was removed : " + data);
        size--;
        return data;

    }

    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty .......");
            return Integer.MIN_VALUE;
        }

        int data = rear.data;
        rear = rear.prev;

        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
        System.out.println("Rear was removed : " + data);
        size--;
        return data;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty .......");
            return Integer.MIN_VALUE;
        } else
            return front.data;
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty .......");
            return Integer.MIN_VALUE;
        } else
            return rear.data;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Deque is Empty .......");
            return;
        }

        Node current = front;
        while (current.next != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertFront(5);
        dq.insertFront(4);
        dq.insertFront(12);
        dq.insertFront(23);
        dq.show();
        dq.insertRear(77);
        dq.show();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
        dq.removeFront();
        dq.show();
        dq.removeRear();
        dq.show();
    }
}
