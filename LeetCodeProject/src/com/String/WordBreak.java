package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("cats");
		list.add("dog");
		list.add("sand");
		list.add("and");
		list.add("cat");
		System.out.println(wordBreak("catsandog", list));
		System.out.println(wordBreakDP("catsandog", list));
		wordBreakLeetcode("catsandog", list);   
	}
	 
	private static void wordBreakLeetcode(String string, List<String> list) {
		  
		  
	}

	private static boolean wordBreakDP(String str, List<String> list) {
		
		 int size = str.length();
		 boolean[] wb = new boolean[str.length()+1];
		 
		 for(int i = 1;i<= size;i++) {
			 
			 if (i == size) 
	                return true;
			 
			 if(wb[i] == false && dictionaryContains(str.substring(0, i+1), list)) {
				 wb[i] = true;
			 }
			 if( wb[i] == true) {
				 for(int j = i+1;j<=size;j++) {
					 if(wb[j] == false && dictionaryContains( str.substring(j,size), list)) 
						 wb[j] = true;
					 
					 if(j == size && wb[j] == true) 
						 return true;
					 
				 }
				
			 }
		 }
		 
		 return false;
	}

	public static boolean wordBreak(String str, List<String> wordDict) {
        
		 int size = str.length();
		 
		    // Base case
		    if (size == 0)  return true;
		 
		    // Try all prefixes of lengths from 1 to size
		    for (int i=1; i<=size; i++)
		    {
		        // The parameter for dictionaryContains is 
		        // str.substr(0, i) which is prefix (of input 
		        // string) of length 'i'. We first check whether 
		        // current prefix is in  dictionary. Then we 
		        // recursively check for remaining string
		        // str.substr(i, size-i) which is suffix of  
		        // length size-i
		        if (dictionaryContains( str.substring(0, i), wordDict ) &&
		            wordBreak( str.substring(i, size) , wordDict))
		            return true;
		    }
		 
		    // If we have tried all prefixes and 
		    // none of them worked
		    return false;
		
    }

	private static boolean dictionaryContains(String substring, List<String> wordDict) {
		
		return wordDict.contains(substring);
	}
}
