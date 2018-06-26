package com.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	
	  public static List<Integer> findDisappearedNumbers(int[] nums) {
	      
		  boolean[] check = new boolean[nums.length];
	        
	        for(int i=0; i<check.length; i++)
	        {
	            check[nums[i]-1] = true;
	        }
	        
	        List<Integer> missingNumbers = new ArrayList<>();
	        
	        for(int i=0; i<check.length; i++)
	        {
	            if(check[i] == false)
	            {
	                missingNumbers.add(i+1);
	            }
	        }
	        
	        return missingNumbers;   
	      
	      
	    }
	
	
	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		List<Integer> l = findDisappearedNumbers(arr);
		for(Integer i : l) {
			System.out.print(i);
		}
	}
	 

}
