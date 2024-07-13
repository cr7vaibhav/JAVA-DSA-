package Queues;

public class queueArray {
    int array[];
    int size, front, rear;
    int capacity;

    queueArray(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(queueArray queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(queueArray queue) {
        return (queue.size == 0);
    }

    void enqueue(int data) {
        if (isFull(this)) {
            System.out.println("Overflow");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = data;
        this.size = this.size + 1;
        System.out.println(data + " inserted in queue");
    }

    int dequeue() {
        if (isEmpty(this)) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front() {
        if (isEmpty(this)) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    int rear() {
        if (isEmpty(this)) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }

        return this.array[this.rear];
    }

    void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[(front + i) % this.capacity] + " "); // Corrected calculation
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queueArray q = new queueArray(5);
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        q.enqueue(3);
        q.show();
        System.out.println(q.dequeue() + " removed form queue");
        System.out.println(q.dequeue() + " removed form queue");
        q.show();
        q.enqueue(9);
        q.enqueue(1);
        q.show();
        q.enqueue(19);
        q.enqueue(15);
        q.show();
        System.out.println(q.dequeue() + " removed form queue");
        q.show();
        System.out.println(q.front() + " " + q.rear());
    }
}
