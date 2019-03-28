package com.String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
		List<String> dict = new ArrayList<>();
		dict.add("hit");
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		dict.add("cog");
		System.out.println(getShortestPath("hit", "cog", dict));
	}

	public static int getShortestPath(String source, String target, List<String> wordList) {
		 Queue<String> q = new LinkedList<>();
	        q.add(source);
	        int count = 1;
	        wordList.remove(source);
	        System.out.println(source);
	        while(!q.isEmpty())
	        {
	        	count++;
	        	String current = q.remove();
	        	for(Iterator<String> it = wordList.iterator(); it.hasNext() ;)
	        	{
	        		String s = it.next();
	        		if(isAdjacent(current , s))
	        		{
	        			System.out.println(s);
	        			count++;
	        			q.add(s);      
	        			if(s == target)
	        				return count;
	        			it.remove();
	        			//break;
	        		}
	        	}
	        }
	        
			return 0;
	}

	public static boolean isAdjacent(String source, String sink){
		char[] c1 = source.toCharArray();
		char[] c2 = sink.toCharArray();
		int count =0;
		for(int i = 0 ; i < source.length() ; i++)
		{
			if(c1[i] != c2[i])
				count++;	
		}
		if(count == 1)
			return true;
		else
			return false;
	}
}
