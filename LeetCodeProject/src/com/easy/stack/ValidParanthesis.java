package com.easy.stack;

import java.util.Stack;

public class ValidParanthesis {

	 public static boolean isValid(String s) {
	      /*  char[] c = m.toCharArray();
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
	     return s.isEmpty();       */
		 
		 
	        char[] arr = s.toCharArray();
	        Stack<Character> stack = new Stack<Character>();
	        
	        for(int i =0;i<arr.length;i++){
	            
	        	   switch(arr[i]){
                   
	                case '}' : if(!stack.isEmpty()){
	                                char c = stack.peek();
	                                if(c== '{'){
	                                    stack.pop();
	                                }
	                            }else{
	                                stack.push('}');
	                            } break;
	                case ']' : if(!stack.isEmpty()){
	                                char c = stack.peek();
	                                if(c== '['){
	                                    stack.pop();
	                                }
	                            }else{
	                                stack.push(']');
	                            } break;
	                case ')' : if(!stack.isEmpty()){
	                                char c = stack.peek();
	                                if(c == '('){
	                                    stack.pop();
	                                }
	                            }else{
	                                stack.push(')');
	                            } break;
	                default : stack.push(arr[i]);
	            }
	            
	        }
	        
	        if(stack.empty()){
	            return true;
	        }else{
	            return false;
	        }
	        
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
