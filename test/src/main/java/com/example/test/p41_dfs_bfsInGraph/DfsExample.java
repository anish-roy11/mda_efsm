package com.example.test.p41_dfs_bfsInGraph;

public class DfsExample {
    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addNode("0");
        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addNode("4");
        graph.addNode("5");

        graph.addEdge("0", "1");
        graph.addEdge("0", "2");
        graph.addEdge("1", "3");
        graph.addEdge("1", "4");
        graph.addEdge("2", "5");

        System.out.println("Depth-First Search starting from vertex 0:");
        graph.dfs("0");
    }
}