package com.String;

public class IntToRoman {

	public static void main(String[] args) {
		System.out.println(IntToRoman(9));
	}

	private static String IntToRoman(int num) {
		
		 /*   Map<Integer,Character> map = new HashMap<Integer,Character>();
	        map.put(1,'I');
	        map.put(5,'V');
	        map.put(10,'X');
	        map.put(50,'L');
	        map.put(100,'C');
	        map.put(500,'D');
	        map.put(1000,'M');*/
	    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuilder sb  = new StringBuilder();
	    
	    for(int i =0;i< values.length;i++) {
	    	while(num>= values[i]) {
	    		num = num - values[i];
	    		sb.append(strs[i]);
	    	}
	    }
	    System.out.println(sb.toString());
	    return sb.toString();
	}
}
