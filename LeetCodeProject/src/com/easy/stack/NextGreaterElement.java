package com.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public int[] nextGreaterElement(int[] findNums, int[] nums) {

		Map<Integer, Integer> map = new HashMap<>(); 
		Stack<Integer> stack = new Stack<Integer>();
		for (int num : nums) {
			while (!stack.isEmpty() && stack.peek() < num)
				map.put(stack.pop(), num);
			stack.push(num);
		}   
		for (int i = 0; i < findNums.length; i++) {
			findNums[i] = map.getOrDefault(findNums[i], -1);
			System.out.print(findNums[i]  +" ");
		}
		return findNums;

	}

	public static void main(String[] args) {
		NextGreaterElement a = new NextGreaterElement();
		int[] findNums = {1,3,4};
		int[] nums = {1,2,3,4};
		a.nextGreaterElement(findNums, nums);
	}

}
