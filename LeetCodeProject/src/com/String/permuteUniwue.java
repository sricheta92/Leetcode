package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class permuteUniwue {

	 public List<List<Integer>> permuteUnique(int[] nums) {
         Map<Integer, Integer> countMap = new TreeMap<>();
	        for (int ch : nums) {
	            countMap.compute(ch, (key, val) -> {
	                if (val == null) {
	                    return 1;
	                } else {
	                    return val + 1;
	                }
	            });
	        }
	        int str[] = new int[countMap.size()];
	        int count[] = new int[countMap.size()];
	        int index = 0;
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            str[index] = entry.getKey();
	            count[index] = entry.getValue();
	            index++;
	        }
            int[] result = new int[nums.length];
            List<List<Integer>> list =new ArrayList<List<Integer>>();
            permuteUtil(str,count, list, 0,  result);
            return list;
        
    }
    
    public void permuteUtil(int[] nums, int[] count, List<List<Integer>> list, int level, int[] result ){
        
        if(level == result.length){
        	List<Integer> list1 = new ArrayList<Integer>();
        	for(int i : result) {
        		list1.add(i);
        	}
            list.add(list1);
            return;
        }
        
        for(int i =0;i<nums.length;i++){
            if(count[i] ==0){
                continue;
            }
            
            result[level] = nums[i];
            count[i]--;
            permuteUtil(nums,count, list, level+1, result);
              count[i]++;
        }
      
        
    }
}
