package com.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class ConstructRectangle {

	public static void main(String[] args) {
		constructRectangle(6);
	}
	
	 public static void constructRectangle(int area) {
		 
		List<Integer> list = new ArrayList<Integer>();
		 for(int i =1;i<=area;i++) {
			 if(area%i ==0) {
				 System.out.print(i+" ");
				 list.add(i);
			 }
		 }
		 System.out.println();
		 int min = Integer.MAX_VALUE;
		 int[] arr1 = new int[2];
		 for(int i: list) {
			 int diff = Math.abs(area/i -i);
			 if(diff<min) {
				 min = diff;
				 arr1[0] = i;
				 arr1[1] = area/i;
			 }
		 }
		 
		 for(int j : arr1) {
			 System.out.print( j +" ");
		 }
	 }
}
