package com.number;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(sqrt(5));
	}

	private static int sqrt(int x) {
		
		    if (x == 0) return 0;
		    int left = 1, right = Integer.MAX_VALUE;
		    while (true) {
		        int mid = left + (right - left)/2;
		        if (mid > x/mid) {
		            right = mid - 1;
		        } else {
		            if (mid + 1 > x/(mid + 1))
		                return mid;
		            left = mid + 1;
		        }
		    }
	}
}
