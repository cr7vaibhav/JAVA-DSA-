package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
       q.add(2); 
       q.add(4); 
       q.add(1); 
       q.add(9); 
       q.add(7); 

       System.out.println(q);
       System.out.println(q.peek());
    
    }

}
