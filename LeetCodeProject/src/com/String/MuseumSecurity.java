package com.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MuseumSecurity {

	public static void main(String args[] ) throws Exception {
		findSchedules(3, 2, "??2??00");
	}
	
public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
        
        int sum = 0;
        int count=0;
        char[] arr = pattern.toCharArray();
        for(int i =0;i<arr.length;i++){
            if(!Character.toString(arr[i]).equals("?")){
                sum = sum + Integer.parseInt(arr[i]+"");
            }else{
                count++;
            }
          
        }
        String s = "";
        List<String> list = new ArrayList<String>();
        findSchedulesUtil(list,workHours- sum, count, s ,  dayHours , 0);
        for(String a : list){
            System.out.print(a+" ");
        }
        System.out.println(list.size());
        
        // ??2??00
        
      List<String> res = new ArrayList<String>();
      for(String str : list) {
    	  int counter =0;
    	  String newStr = "";
    	  for(int i =0;i<arr.length;i++) {
    		  if(arr[i] != '?') {
    			  newStr= newStr+ arr[i];  
    		  }else{
    			  newStr = newStr+ str.charAt(counter);
    			  counter++;
    		  }
    	  }
    	  res.add(newStr);
      }
        
      for(String a : res){
          System.out.print(a+" ");
      }
       
        return list;
    }
    
    public static void findSchedulesUtil(List<String> list, int sum , int count, String s, int dayHours, int start){
        
    	if(sum <0) {
    		return;
    	}
        if(s.length() == count){
        	if(sum == 0) {
        		  list.add(s);
        	}
          return;
        }
        
        for(int i =start;i<=dayHours;i++){
            s = s+i;
            findSchedulesUtil(list, sum -i, count, s, dayHours, i+1);
            s = s.substring(0, s.length()-1);
        }
    }

}


