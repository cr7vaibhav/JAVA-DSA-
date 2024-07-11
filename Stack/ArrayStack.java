package Stack;

public class ArrayStack {
    private int arr[];
    private int top;
    private int capacity;

    ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            System.exit(1);
        }

        System.out.println("pushing : " + data);
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("popping element : " + arr[top]);
        return arr[top--];
    }

    public void show() {
        for (int n : arr) {
            System.out.print(n + " -> ");
        }
        System.out.println();
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(5);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(8);
        stack.show();
        stack.pop();
        stack.show();
        int size=stack.getSize();
        System.out.println("capacity of stack is "+size);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

}
