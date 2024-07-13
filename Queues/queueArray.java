package Queues;

public class queueArray {
    private int queue[] = new int[5];
    private int size;
    private int front;
    private int rear;
    private int capacity=queue.length;


    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % capacity;
            size = size + 1;
        } else {
            System.out.println("Overflow");
        }
    }

    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front + 1) % capacity;
            size = size - 1;
        } else
            System.out.println("Underflow");
        return data;
    }

    public void show() {
        System.out.println("Elements : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
        for (int n : queue) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == capacity;

    }

    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);
        q.deQueue();
        q.deQueue();
        q.show();
        q.enQueue(9);
        q.enQueue(1);
        q.show();
        q.enQueue(19);
        q.enQueue(15);
        System.out.println("Size:" + q.getSize());
        q.show();

        

    }
}
