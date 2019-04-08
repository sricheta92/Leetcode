package com.graph;

public class AlienDictionary {
	
	public static void main(String[] args) {
		String[] words = {"wrt","wrf","er","ett","rftt"}; 
        printOrder(words); 
	}

	private static void printOrder(String[] words) {
		  
        Graph g = new Graph(words.length);
      
        
        for(int i =0;i< words.length-1; i++) {
            String  word1 = words[i];
            String  word2 = words[i+1];
            
            for(int j =0;j< Math.min(word1.length(), word2.length());j++) {
                
                if(word1.charAt(j)!= word2.charAt(j)) {
                    g.adj[word1.charAt(j) - 'a'].add(word2.charAt(j) - 'a');
                    break;
                }
            }
        }
        
       
        g.topologicalSort();
		
	}

}
