package com.graph;

import java.util.List;

public class DetectCycleInDirectedGraph {

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
	    graph.addEdge(0, 2);
	   // graph.addEdge(1, 2);
	 //  graph.addEdge(2, 0);
	    graph.addEdge(2, 3);
	   graph.addEdge(3, 3);
	    System.out.println("Has Cycle ---" + detectCycle(graph));
	}

    private static boolean isCyclicUtil(int i, boolean[] visited,
                                      boolean[] recStack,Graph graph) 
    {
         
        // Mark the current node as visited and
        // part of recursion stack
        if (recStack[i])
            return true;
 
        if (visited[i])
            return false;
             
        visited[i] = true;
 
        recStack[i] = true;
        List<Integer> children = graph.adj[i];
         
        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack,graph))
                return true;
                 
        recStack[i] = false;
 
        return false;
    }
 
    private static boolean detectCycle(Graph graph) 
    {
         
        // Mark all the vertices as not visited and
        // not part of recursion stack
        boolean[] visited = new boolean[graph.V];
        boolean[] recStack = new boolean[graph.V];
         	
         
        // Call the recursive helper function to
        // detect cycle in different DFS trees
        for (int i = 0; i < graph.V; i++)
            if (isCyclicUtil(i, visited, recStack,graph))
                return true;
 
        return false;
    }
}
