package com.medium.stack;

import java.util.Stack;

public class EvaluateRPN {
	
	public static void main(String[] args) {
		System.out.println(evaluate(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
	}

	private static int evaluate(String[] tokens) {
		
		   Stack<Integer> stack = new Stack<Integer>();
	        
	        for(int i =0;i<tokens.length;i++){
	            if(Character.isDigit(tokens[i] -'0')){
	                stack.push(Integer.parseInt(tokens[i]));
	            }else{
	          int val1 = stack.pop();
	                int val2 = stack.pop();
	            switch(tokens[i]){
	              
	                case "+": stack.push(val1+val2);break;   
	                case "-": stack.push(val2-val1);break; 
	                case "/": stack.push(val2/val1);break; 
	                case "*": stack.push(val1*val2);break;     
	            }
	            }
	            
	        }
	        
	        return stack.pop();
	}

}
