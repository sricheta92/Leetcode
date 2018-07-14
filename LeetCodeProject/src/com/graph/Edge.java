package com.graph;

public class Edge implements Comparable<Edge> {
	
	int weight;
	int vertex1;
	int vertex2;
	
	public Edge(int v1,int v2,int w){
		this.vertex1 = v1;
		this.vertex2 = v2;
		this.weight = w;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getVertex1() {
		return vertex1;
	}

	public void setVertex1(int vertex1) {
		this.vertex1 = vertex1;
	}

	public int getVertex2() {
		return vertex2;
	}

	public void setVertex2(int vertex2) {
		this.vertex2 = vertex2;
	}

	

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}

}
