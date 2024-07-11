package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();

        stk.push("Vaibhav");
        stk.push("James");
        stk.push("Cristiano");
        stk.push("Toni");
        System.out.println("Stack : " + stk);

        stk.pop();
        System.out.println("Stack : " + stk);

        System.out.println("Size of Stack : " + stk.capacity());
        System.out.println(stk.peek());

    }

}
