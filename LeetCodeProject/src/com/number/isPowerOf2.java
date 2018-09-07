package com.number;

public class isPowerOf2 {

	public static void main(String[] args) {
		System.out.println(check(1));
	}

	private static boolean check(int i) {
		if(Integer.bitCount(i)==1) {
			return true;
		}else {
			return false;
		}
	}
}
