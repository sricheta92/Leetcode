package com.easy.arrays;

public class SortColors {

	public static void main(String[] args) {
		sortColorsOnePass(new int[] {2,0,2,1,1,0});
		System.out.println();
		sortColorsTwoPass(new int[] {2,0,2,1,1,0});
	}

	private static void sortColorsTwoPass(int[] nums) {

		int lo = 0;
		int hi = nums.length-1;
		int mid =0, temp =0;

		while(mid<=hi) {
			switch(nums[mid]) {
			case 0: temp = nums[lo];
				 	nums[lo] = nums[mid];
				 	nums[lo] = temp;
				 	lo++;
				 	mid++;
				 	break;
			case 1: mid++; break;
			case 2: temp = nums[mid];
					nums[mid] = nums[hi];
					nums[hi] = temp;
					hi--;
					break;
			}
		}
		
		for (int k =0;k<nums.length;k++) {
			System.out.print(nums[k]+" ");
		}

	}

	public static void sortColorsOnePass(int[] nums) {

		int count0 =0;
		int count1 =0;
		int count2 =0;

		for(int i =0;i<nums.length;i++){
			if(nums[i] == 0) count0++;
			if(nums[i] == 1) count1++;
			if(nums[i] == 2) count2++;
		}

		for(int i =0;i<nums.length;i++){
			if(i < count0) nums[i] = 0;
			else if(i< count0+count1) nums[i] = 1;
			else nums[i] = 2;
		}


		for (int k =0;k<nums.length;k++) {
			System.out.print(nums[k]+" ");
		}
	}
}
