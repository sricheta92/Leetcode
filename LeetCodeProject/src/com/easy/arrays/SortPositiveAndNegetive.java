package com.easy.arrays;

public class SortPositiveAndNegetive {

	public static void main(String[] args) {
		sort(new int[] { -2, 3, 5, 0, -3, 7 ,-1});
	}

	private static void sort(int[] num) {
		
		int i =0;
		int j =  num.length-1;
		
		while(true) {
			
			while(num[i]<0 && i<j) {
				i++;
			}
			
			while(num[j]>0 &&i<j) {
				j--;
			}
			if(i<j) {
				swap(num,i,j);
				i++;
				j--;
			}else {
				break;
			}
			
		}
		
		for(int a : num) {
			System.out.print(a);
		}
		
		
	}

	private static void swap(int[] nums, int i, int j) {
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
	
}
