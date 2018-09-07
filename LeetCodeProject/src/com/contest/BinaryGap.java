package com.contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryGap {
	
	public static void main(String[] args) {
		System.out.println(binaryGap(6
				
				));
	}

	private static int binaryGap(int N) {
		
		        
		   
	       String bin = Integer.toBinaryString(N);
	       int ones = Integer.bitCount(N);
	        
	       if(ones<2){
	           return 0;
	       } 
	       
	       int max = Integer.MIN_VALUE;
	       List<Integer> list = new ArrayList<Integer>();
	       for(int i =0;i<bin.length();i++){
	           if(bin.charAt(i) =='1'){
	            
	           list.add(i);
	           }
	       }
	        
	      for(int i =0;i<list.size()-1;i++) {
	    	   int diff = list.get(i+1)- list.get(i);
	    	   if(diff> max) {
	    		   max = diff;
	    	   }
	      }
	      
	      return max;
		
	}

}
