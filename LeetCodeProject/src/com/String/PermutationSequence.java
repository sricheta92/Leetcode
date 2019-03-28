package com.String;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

	public static void main(String[] args) {
		System.out.println(getPermutation(3,2));
		
	}

	public static String getPermutation(int n, int k) {
		List<String> res = new ArrayList<String>();
		String s = "";
		getPermutationUtil(res, s,n);
		System.out.println(res.size());
		for(String a : res) {
			System.out.print(a+" ");
		}
		return res.get(k-1);
	}

	public static void getPermutationUtil( List<String>  res,  String s, int n){
		if(s.length() ==n ){
			res.add(new String(s));
		}   
		for(int i =1;i<=n;i++){
			if(s.contains(i+"")) continue;
			s=s+i;
			getPermutationUtil(res, s, n);
			s = s.substring(0, s.length()-1);
		}
	}
}
