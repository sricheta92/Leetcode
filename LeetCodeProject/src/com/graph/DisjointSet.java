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
	
	void makeSet(int id){
		
	}
	
	Node findSet(int data) {
		
	}
	
	boolean union(int data1, int data2) {
		
		Node parent1 = findSet(data1);
		Node parent2 = findSet(data2);
		
		if(parent1.rank>= parent2.rank) {
			parent1.rank = (parent1.rank> parent2.rank)? parent1.rank+1: parent1.rank;
			parent2.parent = parent1;
		}else {
			parent1.parent = parent2;
		}
	}
}
