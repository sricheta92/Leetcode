package com.medium.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Time coplecity - O(N)
 * @author Sricheta's computer
 *
 */
public class NextGreaterElementII {

	public static void main(String[] args) {
		nextGreaterElements(new int[] {1,2,1});
	}

	public static int[] nextGreaterElements(int[] nums) {
		
		int n = nums.length;
		int[] res = new int[n];
		Arrays.fill(res, -1);
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0;i< n*2;i++) {
			int num = nums[i%n];
			while(!stack.isEmpty() && nums[stack.peek()] < num) {
				res[stack.pop()] = num;
			}
			if(i<n) {
				stack.push(i);
			}
		}
		return res;
	}
}
