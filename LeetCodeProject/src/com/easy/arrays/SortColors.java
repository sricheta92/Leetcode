package com.easy.arrays;

public class SortColors {

	public static void main(String[] args) {
		sortColors(new int[] {2,0,2,1,1,0});
	}
	
	 public static void sortColors(int[] nums) {
	        
	        int count0=0;
	        int count1 =0;
	        int count2 =0;
	        
	        for(int i =0;i<nums.length;i++){
	            if(nums[i] == 0){
	                count0++;
	            }else if(nums[i] == 1){
	                count1++;
	            }else{
	                count2++;
	            }
	        }
	        
	        for(int j =0;j<count0;j++){
	            nums[j] = 0;
	        }
	        for(int j =count0;j<count0+count1;j++){
	            nums[j] = 1;
	        }
	        for(int j =count0+count1;j<nums.length;j++){
	            nums[j] = 2;
	        }
	        
	        for (int k =0;k<nums.length;k++) {
	        	System.out.print(nums[k]+" ");
	        }
	        
	        
	    }
}
