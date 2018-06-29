package com.String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("IX"));
	}
	
	 public static int romanToInt(String s) {
	        
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        
	        int curr =0;
	        int res =0;
	        int prev =0;
	        for(int i = s.length()-1;i>=0;i--){
	            
	            curr = map.get(s.charAt(i));
	            if(curr<prev){
	                res = res -curr;
	            }else{
	                res = res+curr;
	                prev = curr;
	                
	            }
	        }
	        return res;
	    }
	 
	 
}
