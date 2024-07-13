package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>(); // Priority queue
       q.add(2); 
       q.add(4); 
       q.add(1); 
       q.add(9); 
       q.add(7); 

       System.out.println(q);
       System.out.println(q.peek());

       Queue<String> q1=new LinkedList<>();// linked list implementation of queue
       Queue<Integer> q2 =new ArrayDeque<>(); //array implementation of queue

       
    
    }

}
