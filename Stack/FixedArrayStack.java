package Stack;

public class FixedArrayStack {
    private int arr[];
    private int top;
    private int capacity;

    FixedArrayStack(int size) { // constructor to initalize the stack
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        // insert element at top of stack
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        } 
            System.out.println("pushing : " + data);
            arr[++top] = data;
        
    }

    public int pop() {
        // removes and returns element at top of stack
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("popping element : " + arr[top]);
        arr[top] = 0;
        return arr[top--];
    }

    public void show() {
        // prints the stack
        for (int n : arr) {
            System.out.print(n + " -> ");
        }
        System.out.println();
    }

    public int getSize() {
        // returns size of stack
        return top + 1;
    }

    public boolean isFull() {
        // checks if stack is full
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        // checks if stack is empty
        return top == -1;
    }

    public static void main(String[] args) {
        FixedArrayStack stack = new FixedArrayStack(5);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(8);
        stack.show();
        stack.pop();
        stack.show();
        int size = stack.getSize();
        stack.show();
        System.out.println("capacity of stack is " + size);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        stack.pop();
        stack.pop();
        stack.push(3);
        stack.show();
    }

}
