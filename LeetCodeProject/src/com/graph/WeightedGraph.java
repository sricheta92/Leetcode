package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
			Edge e1 = new Edge(src, dest, key);
			Edge e2 = new Edge(src, dest, key);
		    Node srcNode = new Node(src, key);
		    srcNode.addEdge(src, e1);
	        Node destNode = new Node(dest, key);
	        destNode.addEdge(dest, e2);
	        this.adj[src].add(destNode);
	        this.adj[dest].add(srcNode);
		
	}
	
}

 class Node implements Comparable<Node> {
    int vertice, key;

    Map<Integer, List<Edge>> vertexEdgeMap = new HashMap<Integer, List<Edge>>();
    Node(int vertice, int key) {
        this.vertice = vertice;
        this.key = key;
    }

    @Override
    public int compareTo(Node o) {
        return this.key - o.key;
    }
    
    public List<Edge> getEdges(int vertex){
    	return vertexEdgeMap.get(vertex);
    }
    
    public void addEdge(int vertex, Edge e) {
    	if(vertexEdgeMap.containsKey(vertex)) {
    		vertexEdgeMap.get(vertex).add(e);
    	}else {
    		List<Edge> list = new ArrayList<Edge>();
    		list.add(e);
    		vertexEdgeMap.put(vertex, list);
    	}
    }
}
