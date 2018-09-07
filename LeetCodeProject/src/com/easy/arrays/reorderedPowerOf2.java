package com.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class reorderedPowerOf2 {
	static List<String> res =  new ArrayList<String>();
	public static void main(String[] args) {
		System.out.println(reorderedPowerOf2(10));
	}
	
	public static boolean reorderedPowerOf2(int N) {
        
        int onesN = Integer.bitCount(N);
        permute(String.valueOf(N),0,String.valueOf(N).length()-1);
     int i =0;
     
        if(res.size() ==2){
        	for(String j : res) {
        		if(j.charAt(0)=='0'){
            		return false;
            	}
        		  i++;
        	}
        	
      
			
		}
        for(String s : res) {
        		
             int reverseOnes = Integer.bitCount(Integer.parseInt(s));
             
             if(onesN == 1 || reverseOnes ==1){
                 return true;
             }
             
           
        }
        return false;
        
    }
	
	  private static boolean permute(String str, int l, int r)
	    {
		  
	        int onesN = Integer.bitCount(str);
		
	        if (l == r)
	        	int reverseOnes = Integer.bitCount(Integer.parseInt(s));
            
            if(onesN == 1 || reverseOnes ==1){
                return true;
            }
            
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }
	    }
	  public static  String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
}
