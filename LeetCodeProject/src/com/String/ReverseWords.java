package com.String;

public class ReverseWords {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	 public static String reverseWords(String s) {
	        
	        String[] st =  s.split(" ");
	        
	        for(int i =0;i<st.length;i++){
	            st[i] = reverse(st[i]);
	        }
	        
	        String res = "";
	        for(String r : st){
	            res = res + r + " ";
	        }
	        
	        return res.trim();
	    }
	    
	    public static  String reverse(String s){
	        char[] c = s.toCharArray();
	        int start = 0;
	        int end = c.length-1;
	        while(start<end){
	            char temp = c[start];
	            c[start] = c[end];
	            c[end] = temp;
	            start++;
	            end--;
	        }
	        return new String(c);
	    }
}
