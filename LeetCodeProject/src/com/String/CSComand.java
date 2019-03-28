package com.String;

import java.util.ArrayDeque;
import java.util.Deque;

public class CSComand {
	
	private static final String BACK = "..";
    private static final String SLASH = "/";
    
	public static void main(String[] args) {
		System.out.println(getCurrentDir("a/b", "c/../d/e/../f"));
	}

	private static String getCurrentDir(String current, String commands) {
		 Deque<String> stack = new ArrayDeque<String>();
	        String[] split = current.split(SLASH);
	        for (String cmd:split) {
	            stack.push(cmd);
	        }
	 
	 
	        split = commands.split(SLASH);
	        for (String cmd:split) {
	            if (BACK.equals(cmd)) {
	                if (!stack.isEmpty()) {
	                    stack.pop();
	                }
	            } else {
	                stack.push(cmd);
	            }
	        }
	 
	        StringBuilder sb = new StringBuilder();
	        while (!stack.isEmpty()) {
	            String cmd = stack.pop();
	            sb.insert(0,cmd);
	            sb.insert(0,SLASH);
	        }
	        return sb.toString();
	}
}
