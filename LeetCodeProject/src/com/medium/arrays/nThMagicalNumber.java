package com.medium.arrays;

public class nThMagicalNumber {

	public static void main(String[] args) {
		System.out.println(nthMagicalNumber(3,8,9));	
	}
	
	 public static int nthMagicalNumber(int N, int A, int B) {

		 	int times= 1000000000 % (10^9 + 7);
		 	if(times ==0) {
		 		times = 1000000000;
		 	}
	        int count =0;
	      //  A = A % 40000;
	       // B = B % 40000;
	        for(int i =1;i<=times;i++){
	            if(i%A ==0){
	                count++;
	            }else if(i%B ==0){
	            	 count++ ;
	            }
	            if(count == N){
	                return i;
	            }
	            
	          
	            
	        }
	        
	        return 0;
	    }
}

