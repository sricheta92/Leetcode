package com.easy.arrays;

public class ReverseInteger {

	 public static int reverse(int x) {
		 
	  int i = 1;
      StringBuilder sb = new StringBuilder();
  int y = Math.abs(x);

      while(y>0){
          i = y%10;
          if(i != 0 ){
              sb.append(i);
          }
          y = y/10;
      }
     int reverse = Integer.parseInt(sb.toString());
   
      return (x<0) ? -reverse : reverse;
}
	 public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
