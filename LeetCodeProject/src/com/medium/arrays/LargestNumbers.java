package com.medium.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumbers {
	
	public static void main(String[] args) {
		findLargest(new int[] {3, 30, 34, 5, 9});
	}

	private static void findLargest(int[] is) {
		
		List<String> list = new ArrayList<String>();
		for(int a : is) {
			list.add(a+"");
		}
		
		Collections.sort(list, new Comparator<String>() {
			public int compare(String X, String Y) {
				String XY = X+Y;
				String YX = Y+X;
				
				 return - XY.compareTo(YX);
			}
		});
		
		for(String a : list) {
			System.out.print(a+"");
		}
		
	}

}
