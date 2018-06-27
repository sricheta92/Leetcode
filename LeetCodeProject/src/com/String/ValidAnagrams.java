package com.String;

public class ValidAnagrams {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("a","b"));
		
	}
	
public  static boolean isAnagram(String s, String t) {
        
    
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
