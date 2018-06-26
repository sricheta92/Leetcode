package com.String;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		
		System.out.println(convertToTitle(701));
	}

	private static String convertToTitle(int n) {
		
		   
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rem = --n%26;
            sb.append((char)('A' + rem));
            n = n/26;
        }
        
        return sb.reverse().toString();
		
        
	}
}
