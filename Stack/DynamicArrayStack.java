package Stack;

public class DynamicArrayStack {
    private int arr[];
    private int top;
    private int capacity;

    DynamicArrayStack(int size) { // constructor to initalize the stack
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        // insert element at top of stack
        if (isFull())
            expand();

        System.out.println("pushing : " + data);
        arr[++top] = data;

    }

    private void expand() {//increases the size of array by 1 when stack isfull
        int length = capacity;
        int[] newStack = new int[capacity + 1];
        System.arraycopy(arr, 0, newStack, 0, length);
        arr = newStack;
        capacity += 1;
    }

    public int pop() {
        // removes and returns element at top of stack
        int data = -1;
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            System.out.println("popping element : " + arr[top]);
            data = arr[top];
            top--;
            reduce();
        }
        return data;
    }

    private void reduce() {// reduces the size of array by 1 when a pop happens
        int length = capacity - 1;
        int[] newStack = new int[length];
        System.arraycopy(arr, 0, newStack, 0, length);
        arr = newStack;
        capacity -= 1;
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
        DynamicArrayStack dstack = new DynamicArrayStack(1);
        dstack.push(5);
        dstack.show();
        dstack.push(2);
        dstack.show();
        dstack.push(7);
        dstack.show();
        dstack.push(9);
        dstack.show();
        dstack.push(11);
        dstack.show();
        dstack.push(3);
        dstack.show();
        dstack.push(24);
        dstack.show();
        dstack.push(69);
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.push(1);
        dstack.show();
    }
}
