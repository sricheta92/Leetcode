package com.String;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
	
	public static void main(String[] args) {
		findAnagrams("cbaebabacd","abc");
	}

	private static void findAnagrams(String s, String p) {
		
		 List<Integer> indexes = new ArrayList<Integer>();
	        
	        for(int i =0;i<s.length()-p.length()+1;i++){
	           String temp = s.substring(i,i+p.length());
	           if(isValidAnagram(temp,p)) {
	        	   indexes.add(i);
	           }
	        }
	        
	        for(int i:indexes) {
	        	System.out.print(i+" ");
	        }
	        
	}

	private static boolean isValidAnagram(String s, String t) {
		   
	    if(s.length() != t.length()){
	         return false;
	     }
	     int[] arr1 = new int[256];
	     for(int i =0;i<s.length();i++){
	          arr1[s.charAt(i)]++;
	     }
	     
	     for(int j =0;j<t.length();j++){
	    	 arr1[t.charAt(j)]--;
	     }
	    for(int k =0;k<arr1.length;k++) { 
	     if(arr1[k]!=0) {
	     	return false;
	     }
	    }
	    
	     
	     return true;
	     
		
	}

}
