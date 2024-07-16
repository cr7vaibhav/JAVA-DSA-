package Collections.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("A");
        pq.add("C");
        pq.add("B");

        System.out.println(pq);

        System.out.println(pq.peek());// printing top element
        System.out.println(pq.poll());// printing top element adn removing it

        System.out.println(pq.peek());

        System.out.println(pq.size());

        for (String string : pq) {
            System.out.println(string);
        }
    }
}
