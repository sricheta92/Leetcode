package com.contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumofSubarrayMinimums {

	public static void main(String[] args) {
		sumSubarrayMins(new int[] {3,1,2,4});
	}

	public static int sumSubarrayMins(int[] A) {
		
		long sum =0;
		for(int i =0;i<A.length;i++) {
			String s = "";

			List<Integer> l = new ArrayList<Integer>();
			for(int j =i;j<A.length;j++) {
				
				l.add(A[j]);
				s = s+ A[j];
				sum += findMin(Long.parseLong(s));
				l.clear();
			//	System.out.println(findMin(Integer.parseInt(s)));
			}
			l.clear();
			
		}
		return (int)sum;
		//System.out.println(sum);
	}

	private static long findMin(long n) {
		List<Long> l = new ArrayList<Long>();
		while(n>0) {
			long temp = n%10;
			l.add(temp);
			n = n/10;
		}
		
		return Collections.min(l);
	}
}
