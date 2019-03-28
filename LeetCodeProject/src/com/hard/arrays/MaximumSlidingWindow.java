package com.hard.arrays;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 4;
		getSlidingMaximumNaive(arr,k);
	}
	
	/**
	 * Time complexity : O(nk)
	 * @param arr
	 * @param k
	 */
	private static void getSlidingMaximumNaive(int[] arr, int k) {
		
		Deque<Integer> q = new LinkedList<Integer>();
		int i;
		for( i =0;i<k;i++) {
			while(!q.isEmpty() && arr[i]>= arr[q.peekLast()]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		
		for(;i<arr.length;i++) {
			
			System.out.println(q.peek());
			
			while(!q.isEmpty() && q.peek()<=i-k) {
				q.removeFirst();
			}
			
			while(!q.isEmpty() && arr[i]>= arr[q.peekLast()]) {
				q.removeLast();
			}
			
			q.addLast(i);
		}
		
		
	}
	
	
}
