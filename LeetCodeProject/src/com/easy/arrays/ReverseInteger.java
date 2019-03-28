package com.easy.arrays;

public class ReverseInteger {

	 public static int reverse(int x) {
		 
	/*  int i = 1;
      StringBuilder sb = new StringBuilder();
  int y = Math.abs(x);

      while(y>0){
          i = y%10;
          if(i != 0 ){ c 
              sb.append(i);
          }
          y = y/10;
      }
     int reverse = Integer.parseInt(sb.toString());
   
      return (x<0) ? -reverse : reverse;*/
		 	
		 int rev_num = 0;
		 
		 while(x>0) {
			 rev_num = rev_num*10 + x%10;
			// rev_num =  x%10;
			 //System.out.print(rev_num+"");
			 x = x/10;
		 }
		 return rev_num;
}
	 public static void main(String[] args) {
		System.out.println(reverse(3234234));
	}
}
