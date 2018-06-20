package com.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	
	  public List<Integer> findDisappearedNumbers(int[] nums) {
		  Arrays.sort(nums);
		     List<Integer> list = new ArrayList<Integer>();
		     int min = nums[0];
		     int max = nums[nums.length-1];
		     
		     for(int i = 0;i<= nums.length-1;i++){
		         if(min != nums[i]){
		             list.add(min);
		         }
		         min++;
		     }
		     int[] stockArr = new int[list.size()];
		     //return list.toArray();
	  }
	
	
	public static void main(String[] args) {
		
	}
	 

}
