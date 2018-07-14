package com.graph;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {

	Map<Integer, Node> map = new HashMap<Integer,Node>();
			
	class Node{
		int data;
		int rank;
		Node parent;
	}
	
	void makeSet(int data){
		Node n = new Node();
		n.data = data;
		n.rank =0;
		n.parent = n;
		map.put(data, n);
	}
	
	public int findSet(int data) {
		return findSet(map.get(data)).data;
	}
	
	public Node findSet(Node node) {
		Node parent = node.parent;
		if(parent == node) {
			return node;
		}
		else return findSet(node.parent);
	}
	
	boolean union(int data1, int data2) {
		
		Node node1 = map.get(data1);
		Node node2 = map.get(data2);
		
		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);
		
		if(parent1 == parent2) {
			return false;
		}

		if(parent1.rank>= parent2.rank) {
				parent1.rank = (parent1.rank> parent2.rank)? parent1.rank+1: parent1.rank;
				parent2.parent = parent1;
		}else {
				parent1.parent = parent2;
		}
		
		return true;
	}
		
	
}
