package com.medium.trees;

/**
 * We know that all node in left subtree are smaller than root and in right subtree are larger than root so if we 
 * have ith number as root, all numbers from 1 to i-1 will be in left subtree and i+1 to N will be in right subtree. 
 * If 1 to i-1 can form x different trees and i+1 to N can from y different trees then we will have x*y total trees
 *  when ith number is root and we also have N choices for root also so we can simply iterate from 1 to N for root and
 *   another loop for left and right subtree. If we take a closer look, we can notice that the count is 
 *   basically n’th Catalan number.
 *   
 *   Time complexity - O(n^	2)
 * @author Sricheta's computer
 *
 */
public class UniqueNumberOfBSTs {
	public static void main(String[] args) {
		System.out.println(find(5));
	}

	private static int find(int n) {
		int[] res = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		
		for(int i =2;i<n+1;i++) {
			for(int j =0; j<i;j++) {
				res[i] = res[i] + res[j]* res[i-j-1];
			}
		}
		return res[n];
	}
}
