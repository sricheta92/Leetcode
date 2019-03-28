package com.easy.arrays;

import java.util.LinkedList;
import java.util.List;


public class ArryaToLinkedList {
	
	public static void main(String[] args) {
		solution(new int[] {1, 4, -1, 3, 2});
	}

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        List<Integer> list = new LinkedList<Integer>();
	        boolean containsMinusOne = false;
	        for(int i =0;i<A.length;i++) {
	        	if(i ==0 && A[i] != -1) {
	        		list.add(A[i]);
	        		continue;
	        	}
	        	if(A[i] == -1) {
	        		containsMinusOne = true;
	        		i++;
	        	}else{
	        		  list.add(A[list.get(list.size()-1)]);
	        	}
	        	
	        }
	        
	        if(containsMinusOne) {
	        	list.add(-1);
	        }
	        
	        System.out.println(list.size());
			return 0;
	    }
}
