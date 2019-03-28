package com.medium.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {
		do3SumBySorting(new int[] {-1, 0, 1, 2, -1, -4}, 0);
		do3SumByOptimisedSorting(new int[] {-1, 0, 1, 2, -1, -4}, 0);
		do3SumByHashing(new int[] {-1, 0, 1, 2, -1, -4}, 0);
	}

	private static void do3SumByOptimisedSorting(int[] arr, int sum) {
		Arrays.sort(arr);
		for(int i =0;i< arr.length-2;i++) {
			if(i ==0 || arr[i]!= arr[i-1]) {
				int lo =i+1;
				int hi = arr.length-1;
				while(lo<hi) {
					if(arr[lo]+ arr[hi] + arr[i] == sum) {
						System.out.println("The numbers are : "+ arr[lo] + " " + arr[hi] +" "+ arr[i]);
						 lo++; hi--;
						while(lo<hi && arr[lo] == arr[lo+1]) lo++;
						while(lo<hi && arr[hi] == arr[hi-1]) hi--;
					}
					else if(arr[lo]+ arr[hi] + arr[i] < sum) lo++;
					else hi--;
				}
			}
		}
		
		
	}

	private static void do3SumByHashing(int[] arr, int sum) {
		Map<Integer, Pair> map = new HashMap<Integer, Pair>();
		for(int i =0;i< arr.length-1;i++) {
			for(int j =i+1;j<arr.length-1;j++) {
				int temp = sum - (arr[i]+ arr[j]);
				if(map.containsKey(temp)) {
					Pair  p = map.get(temp);
					System.out.println("The numbers are " + temp +" "+ p.x+" "+ p.y);
				}else {
					map.put(temp, new Pair(arr[i], arr[j]));
				}
			}
		}
	
		
	}
	
	/**
	 * O(n^2)
	 * @param arr
	 * @param sum
	 * @return
	 */
	private static boolean do3SumBySorting(int[] arr, int sum) {
		int l,r;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			 l = i+1;
			 r = arr.length-1;
			while(l<r) {
				if(arr[i] + arr[l]+ arr[r] == sum) {
					System.out.println("index"+ arr[i] +" "+ arr[l]+" "+ arr[r]);
					return true;
				}
				else if(arr[i] + arr[l]+ arr[r]<sum) {
					l++;
				}else {
					r--;
				}
			}
		}
		
		return false;
	}
}


