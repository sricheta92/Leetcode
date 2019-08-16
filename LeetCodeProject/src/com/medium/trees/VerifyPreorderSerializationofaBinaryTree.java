package com.medium.trees;

import java.util.Stack;

public class VerifyPreorderSerializationofaBinaryTree {

	public static void main(String[] args) {
		String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
		isValidSerialization(preorder);
	}

	private static boolean isValidSerialization(String preorder) {
		
		String[] arr = preorder.split(",");
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < preorder.length();i++) {
			String curr = arr[i];
			if(curr.equals("#")) {
				while(curr.equals("#") && !stack.isEmpty() && stack.peek().equals(curr)) {
					stack.pop();
					if(stack.isEmpty()) {
						return false;
					}
					stack.pop();
				}
				
			}
			stack.push(curr);
		}
		
		return stack.size() == 1 && stack.peek().equals("#");
		
	}
}
