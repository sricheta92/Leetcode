package com.String;

import java.util.HashSet;
import java.util.Set;

public class LetterCasePermutation {

	public static void main(String[] args) {
		generateLetterCasePermutation("123");
		permute("ab");
	}

	static void permute(String input) 
    { 
        int n = input.length(); 
          
        // Number of permutations is 2^n 
        int max = 1 << n; 
          
        // Converting string to lower case 
        input = input.toLowerCase(); 
          
        // Using all subsequences and permuting them 
        for(int i = 0;i < max; i++) 
        { 
            char combination[] = input.toCharArray(); 
              
            // If j-th bit is set, we convert it to upper case 
            for(int j = 0; j < n; j++) 
            { 
                //if(((i >> j) &  1) == 1) 
            	if( (i & (1<<j)) >0)
                    combination[j] = (char) (combination[j]-32); 
            } 
              
            // Printing current combination 
            System.out.print(combination); 
            System.out.print("   "); 
        } 
    } 
	
	private static void generateLetterCasePermutation(String s) {
		
		/*Set<String> list = new HashSet<String>();
		list.add(s);
		
		for(int i =0;i<s.length();i++) {
			(s.charAt(i)+"").toUpperCase();
		}*/
		char[] c = s.toCharArray();
		double powset = Math.pow(2, c.length);
		for(int i =0;i<powset;i++) {
			
			for(int j =0;j<s.length();j++) {
				//System.out.println((i & (1<<j)));
				if((i & (1<<j)) >0) {
					
					System.out.print(c[j]);
				}
				//System.out.println( );
			}
			System.out.println("");
		}
		
	}
}
