package com.number;

public class isPowerOf4 {
	
	public static void main(String[] args) {
		System.out.println(isPowerOf4(8));
	}

	private static boolean isPowerOf4(int i) {
		
		if(i==1) {
			return true;
		}
		
		while(i>0) {
			int rem = i%4;
			if(rem ==0){
				i = i/4;
				if(i ==1) {
					return true;
				}
			}else {
				return false;
			}
		}
		
		return false;
	}

}
