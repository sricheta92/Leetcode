package com.easy.stack;

import java.util.Stack;

public class DailyTemperatures {
	
public static int[] dailyTemperatures(int[] temperatures) {
        
   
	
	
	Stack<Integer> stack = new Stack<Integer>();
	int[] res = new int[temperatures.length];
	for(int i =0;i<temperatures.length;i++ ) {
		int num = temperatures[i];
		while (!stack.isEmpty() && temperatures[stack.peek()] < num) {
			int nums = stack.peek();
			res[stack.pop()]=  i-nums;
		}
		stack.push(i);
	}
	
	
	return res;
	
	
    }

	public static void main(String[] args) {
		int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] arr1 = dailyTemperatures(arr);
		System.out.println(arr1);
		
		
	}

}
