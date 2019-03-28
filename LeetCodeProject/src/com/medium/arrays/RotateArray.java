package com.medium.arrays;

public class RotateArray {

	public static void main(String[] args) {
		leftrotateArray(new int[]{1, 2, 3, 4, 5, 6, 7},2);
		System.out.println();
		jugglingLeftRotate(new int[] {1, 2, 3, 4, 5, 6, 7},2);
		rightrotateArray(new int[] {1, 2, 3, 4, 5, 6, 7},2);
	}

	private static void jugglingLeftRotate(int[] arr, int d) {
		int gcd = gcd(arr.length,d);
		
		for(int i =0;i<gcd;i++) {
			
			int temp= arr[i];
			int j =i;
			
			while(true) {
				int k = j+d;
				if(k>=arr.length) {
					k = k-arr.length;
				}
				if(k ==i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}

	private static int gcd(int a, int b) {
		
		if(b ==0) {
			return a;
		}
		return gcd(b, a%b);
		
		
	}

	private static void rightrotateArray(int[] nums, int d) {
	
        if(nums== null || nums.length == 0){
            return;
        }
        
        for(int i = 0;i<d;i++){
            rightRotate(nums);
        }
        
        for(int i: nums) {
			System.out.print(i+" ");
		}
	}

	private static void rightRotate(int[] arr) {
		 /*int x = arr[arr.length-1]; 
	       for (int i = arr.length-1; i > 0; i--) 
	          arr[i] = arr[i-1]; 
	       arr[0] = x; */
		
		
		
	}

	private static void leftrotateArray(int[] nums, int d) {
		for(int i =0;i<d;i++) {
			leftRotate(nums);
		}
		
		for(int i: nums) {
			System.out.print(i+" ");
		}
	}

	private static void leftRotate(int[] nums) {
		
		int t = nums[0];
		for(int i =0;i<nums.length-1;i++) {
			nums[i] = nums[i+1];
		}
		nums[nums.length-1] = t;
		
	}
}
