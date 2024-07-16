package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}

public class GraphAdjList {
    // Adjacency list = an array/arraylist of linked lists
    // Each linked list has a unique node at the head
    // All adjacent neighbours are added to that node's linked list
    // RTC O(v) SC O(v+e)

    ArrayList<LinkedList<Node>> alist;

    GraphAdjList() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentlist = new LinkedList<>(); // Create a new linked list for the node
        currentlist.add(node); // Add the node to the linked list
        alist.add(currentlist); // Add the linked list to the adjacency list
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentlist = alist.get(src); // Get the linked list for the source node
        Node dstNode = alist.get(dst).get(0); // Get the destination node
        currentlist.add(dstNode); // Add the destination node to the source node's linked list
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentlist = alist.get(src);// will return a linked list
        Node dstNode = alist.get(dst).get(0); // Get the destination node

        // Iterate through the source node's linked list to check for the destination
        // node
        for (Node node : currentlist) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> currentlist : alist) {
            for (Node node : currentlist) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList();
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1); // A -> B
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(2, 3); // C -> D
        graph.addEdge(2, 4); // C -> E
        graph.addEdge(4, 0); // E -> A
        graph.addEdge(4, 2); // E -> C

        graph.print();

        System.out.println();
    }
}
