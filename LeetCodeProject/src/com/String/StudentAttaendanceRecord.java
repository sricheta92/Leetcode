package com.String;

public class StudentAttaendanceRecord {

	public static void main(String[] args) {
		System.out.println(checkRecord("LLLALL"));
	}

	private static boolean checkRecord(String s) {
		
		int[] arr = new int[256];
		//char L = ;
		int count =0;
		for(char s1 : s.toCharArray()) {
			if(count>2) {
				return false;
			}
			if(s1 == 'L') {
				count++;
			}else {
				count =0;
			}
			arr[s1]++;
		}
		
		
		
		for(int i =0;i<s.length();i++) {
			
			if(s.charAt(i) == 'A' && arr['A']>1) {
				return false;
			}
		}
		return true;
		
	}
}
