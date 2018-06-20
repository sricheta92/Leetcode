package com.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
	
public static int[] dailyTemperatures(int[] temperatures) {
        
        /*int[] arr = new int[temperatures.length];
        Stack<Integer> s = new Stack<Integer>();
        int next,element =0;
        s.push(temperatures[0]);
        int count=0;
            
        for(int i =1;i<temperatures.length;i++){
          
            next = temperatures[i];
          
            
            if(!s.isEmpty()){
            	element = s.pop();
                while(next>element){
                    count++;
                    arr[i-1] = count;
                    if(s.isEmpty()){
                      count =0;
                        break;
                    }
                    element = s.pop();
                }
                
                if(element>next){
                	count++;
                    s.push(element);
                }
                
            }
            
            s.push(next);
            
        }
        
        return arr;*/
	
	Map<Integer, Integer> map = new HashMap<>(); 
	Stack<Integer> stack = new Stack<Integer>();
	for (int num : temperatures) {
		while (!stack.isEmpty() && stack.peek() < num) {
			int nums = stack.peek();
			map.put(stack.pop(), num-nums);
		}
		stack.push(num);
	}   
	for (int i = 0; i < temperatures.length; i++) {
		temperatures[i] = map.getOrDefault(temperatures[i], 0);
		System.out.print(temperatures[i]  +" ");
	}
	return temperatures;
	
	
    }

	public static void main(String[] args) {
		int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] arr1 = dailyTemperatures(arr);
		
		/*for(Integer a :arr1) {
			System.out.print(a+" ");
		}*/
		
	}

}
