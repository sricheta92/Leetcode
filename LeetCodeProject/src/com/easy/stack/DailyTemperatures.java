package com.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
	
public static int[] dailyTemperatures(int[] temperatures) {
        
   
	
	Map<Integer, Integer> map = new HashMap<>(); 
	Stack<Integer> stack = new Stack<Integer>();
	for (int num : temperatures) {
		while (!stack.isEmpty() && stack.peek() < num) {
			int nums = stack.peek();
			map.put(stack.pop(), num-nums);
		}
		stack.push(num);
	}   
	for (int i = 0; i < temperatures.length; i++) {
		temperatures[i] = map.getOrDefault(temperatures[i], 0);
		System.out.print(temperatures[i]  +" ");
	}
	return temperatures;
	
	
    }

	public static void main(String[] args) {
		int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] arr1 = dailyTemperatures(arr);
		
		
		
	}

}
