package Graphs;

import java.util.ArrayList;

// Adjacency Matrix -> 2d array to store 1/0s to represent edges
// no od rows and columns =no od unique nodes

// RTC O(1)
// SC O(v^2)

class Node {
    char data;

    public Node(char data) {
        this.data = data;
    }
}

public class GraphAdjMatrix {
    ArrayList<Node> nodes;
    int[][] matrix;

    public GraphAdjMatrix(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {// source and destination row and column
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.err.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjMatrix graph = new GraphAdjMatrix(5);

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

        System.out.println(graph.checkEdge(0, 1));
    }
}
