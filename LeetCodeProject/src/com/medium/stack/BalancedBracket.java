package com.medium.stack;

import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		System.out.println(isBalanced("{}))"));
	}
	
	 static String isBalanced(String s) {
	        char[] c = s.toCharArray();
	        Stack<Character> stack = new Stack<Character>();
	        for(int i =0;i<c.length;i++){
	            switch(c[i]){
	                case '{' : stack.push('}');break;
	                case '[' : stack.push(']');break;
	                case '(' : stack.push(')');break;
	                default :  if(stack.isEmpty() || stack.pop() != c[i])
	        			return false;
	                
	            }
	        }
	        
	        if(stack.isEmpty()){
	            return "YES";
	        }else{
	            return "NO";
	        }

	    }
}

