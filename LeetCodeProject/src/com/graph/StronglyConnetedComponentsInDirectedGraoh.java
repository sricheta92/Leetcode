package com.graph;

import java.util.Iterator;
import java.util.Stack;

/**
 * Using Korasjau's algorithm 
 * Time COmplexity -  O(E+V)
 * @author Sricheta's computer
 *
 */
public class StronglyConnetedComponentsInDirectedGraoh {

	public static void main(String[] args) {

		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		// graph.addEdge(1, 2);
		//  graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		System.out.println("Is Strongly connected " );
		printStronglyConnectedComponents(graph);

	}

	private static void printStronglyConnectedComponents(Graph graph) {

		boolean[] visited = new boolean[graph.V];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0;i< graph.V;i++) {
			if(!visited[i]) {
				graph.topologicalSortUtil(i, visited, stack);
			}
		}

		Graph g1 = graph.transpose(graph.V);
		for(int i =0; i< graph.V;i++) {
			visited[i] = false;
		}

		while(!stack.isEmpty()) {
			int v = stack.pop();
			if(!visited[v]) {
				g1.dfsUtil(v, visited);
				System.out.println();
			}
		}


	}
}
