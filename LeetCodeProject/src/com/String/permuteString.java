package com.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class permuteString {

	public static void main(String[] args) {
		permute("AABC".toCharArray());
	}

	private static void permute(char[] input) {
		  Map<Character, Integer> countMap = new TreeMap<>();
	        for (char ch : input) {
	        	countMap.get
	            countMap.compute(ch, (key, val) -> {
	                if (val == null) {
	                    return 1;
	                } else {
	                    return val + 1;
	                }
	            });
	        }
	        char str[] = new char[countMap.size()];
	        int count[] = new int[countMap.size()];
	        int index = 0;
	        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
	            str[index] = entry.getKey();
	            count[index] = entry.getValue();
	            index++;
	        }
	       char[] result = new char[input.length];
	       List<String> resultList = new ArrayList<String>();
	       permuteUtil(str, count, 0, result, resultList );
	       for(String a: resultList) {
	    	   System.out.println(a+" ");
	       }
	}

	private static void permuteUtil(char[] str, int[] count, int level, char[] result, List<String> resultList) {
		
		if(level == result.length) {
			resultList.add(new String(result));
			return;
		}
		
		for(int i =0;i<str.length;i++) {
			
			if(count[i] ==0) {
				continue;
			}
			result[level] = str[i];
			count[i]--;
			permuteUtil(str, count, level+1,result, resultList);
			count[i]++;
			
		}
		
		
		
	}
}
