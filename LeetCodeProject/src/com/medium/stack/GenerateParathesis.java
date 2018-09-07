package com.medium.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParathesis {

	public static void main(String[] args) {
		List<String> res  = new ArrayList<String>();
    	 System.out.println(generateBrace(res,"",0,0,3));
	}

	
	public static  List<String> generateBrace( List<String> res,String s, int open, int close, int N) {
		
		if(open == N && close == N) {
			res.add(s);
		}else {
			if(open<N) {
				generateBrace(res,s+"(", open+1,close,N);
			}
			if(close<open) {
				generateBrace(res,s+")", open,close+1,N);
			}
		}
		
        return res;
	}

}
