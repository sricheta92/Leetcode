package com.easy.stack;

import java.util.Stack;

public class ValidParanthesis {

	 public static boolean isValid(String m) {
	        char[] c = m.toCharArray();
	        Stack<Character> s = new Stack<Character>();
	        
	        
	        for(int i = 0;i<c.length;i++){
	            if(c[i] == '{' || c[i] == '(' || c[i] == '['){
	                s.push(c[i]);
	            }else{
	                if (c[i] == '}' || c[i] == ')' || c[i] == ']')
	                 {
	                    if (s.isEmpty())
	                       {
	                           return false;
	                       } 
	                    else{
	                        if(!machingPair(s.pop(),c[i])){
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	     return s.isEmpty();       
	    }
	 public static  boolean machingPair(char character1 , char character2){
	        if (character1 == '(' && character2 == ')')
	         return true;
	       else if (character1 == '{' && character2 == '}')
	         return true;
	       else if (character1 == '[' && character2 == ']')
	         return true;
	       else
	         return false;
	    }
	 
	public static void main(String[] args) {
		System.out.println(isValid("(])"));
	}
}
