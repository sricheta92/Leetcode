package com.number;

public class isPowerOf3 {

	public static void main(String[] args) {
		System.out.println(isPowerOf3(81));
	}

	private static boolean isPowerOf3(int n) {
		
		if(n ==1) {
			return true;
		}
		while(n>0){
			int rem =  n%3;
			if(rem ==0) {
				n = n/3;
				if(n ==1) {
					return true;
				}
			}else {
				return false;
			}
		}
		
		return false;
	}
}
