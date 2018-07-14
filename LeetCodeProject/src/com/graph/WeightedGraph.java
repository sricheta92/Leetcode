package com.graph;

import java.util.LinkedList;

public class WeightedGraph {
	
	public int V;
	public LinkedList<Node> adj[]  ;
	
	WeightedGraph(int V){
		this.V = V;
		adj = new LinkedList[V];
		for(int i =0;i<V;i++) {
			adj[i] = new LinkedList<Node>();
		}
	}

	public void addEdge(int src, int dest, int key) {
		
		    Node srcNode = new Node(src, key);
	        Node destNode = new Node(dest, key);
	        this.adj[src].add(destNode);
	        this.adj[dest].add(srcNode);
		
	}
	
}

 class Node implements Comparable<Node> {
    int vertice, key;

    Node(int vertice, int key) {
        this.vertice = vertice;
        this.key = key;
    }

    @Override
    public int compareTo(Node o) {
        return this.key - o.key;
    }
}
