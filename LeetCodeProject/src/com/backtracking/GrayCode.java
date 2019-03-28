package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
		grayCode(3);
	}

	public static List<String> grayCode(int n) {
		int[] nums = {0,1};
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		grayCodeUtil(nums,sb, list, n);
		return list;
	}
	public static void grayCodeUtil(int[] nums, StringBuilder sb, List<String> list, int n  ){
		if(sb.length() == n){
			list.add(sb.toString());
			return;
		}

		for(int i =0;i< nums.length;i++) {
			sb.append(nums[i]);
			grayCodeUtil(nums, sb, list, n);
			sb.setLength(sb.length()-1);
		}
	}

}
