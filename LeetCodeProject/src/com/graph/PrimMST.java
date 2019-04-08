package com.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
/**
 * Time complexity  O(E+ VlogV)
 * @author Sricheta's computer
 *
 */
public class PrimMST {


   
    public static void main(String args[]){
        WeightedGraph MST = new WeightedGraph(9);

        MST.addEdge( 0, 1, 4);
        MST.addEdge( 0, 7, 8);
        MST.addEdge( 1, 2, 8);
        MST.addEdge( 1, 7, 11);
        MST.addEdge( 2, 3, 7);
        MST.addEdge( 2, 8, 2);
        MST.addEdge( 2, 5, 4);
        MST.addEdge( 3, 4, 9);
        MST.addEdge( 3, 5, 14);
        MST.addEdge( 4, 5, 10);
        MST.addEdge( 5, 6, 2);
        MST.addEdge( 6, 7, 1);
        MST.addEdge( 6, 8, 6);
        MST.addEdge( 7, 8, 7);


      
       primMST(MST);
    
        
    }


	private static void primMST(WeightedGraph graph) {

		Node[] keys = new Node[graph.V];
		int[] parent = new int[graph.V];
		boolean[] mset = new boolean[graph.V];
		
		for(int i =0;i<graph.V;i++) {
			keys[i] = new Node(i, Integer.MAX_VALUE);
			parent[i] = -1;
		}
		
		keys[0].key = 0;
		
		Queue<Node> q = new PriorityQueue<Node>();
		q.addAll(Arrays.asList(keys));
		
	    while (q.size() > 1) {
            Node u = q.remove();
            mset[u.vertice] = true;

            ListIterator it = graph.adj[u.vertice].listIterator();
            while(it.hasNext()) {
            	Node node = (Node)it.next();
            	int v = node.vertice;
            	 if (mset[v] == false && node.key < keys[v].key) {
                     q.remove(keys[v]); //remove that node from q

                     keys[v].key = node.key; //chaxnge key
                     parent[v] = u.vertice;
                     q.add(keys[v]); //add back
                     //remove add can me made single function by using a visited flag
                     // instead of actually removing node just mark it as dirty and use polling later
                     //remove_add() in O(lg(n))
                  }
            }
           
        }
	    
	    printMST(graph, parent, keys);
	}

	private static void printMST(WeightedGraph graph, int[] parent, Node[] keys) {
		
		int vertice = graph.V;
		for(int i =0;i<vertice;i++) {
			System.out.println(parent[i] +" "+ i+ "->" + keys[i].key );
		}
	}
    
}
