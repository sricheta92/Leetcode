package com.String;

import java.util.Arrays;
import java.util.Comparator;

/**
 *  For each log, the first word in each log is an alphanumeric identifier.  Then, either:

	Each word after the identifier will consist only of lowercase letters, or;
	Each word after the identifier will consist only of digits.
	
	We will call these two varieties of logs letter-logs and digit-logs. 
	It is guaranteed that each log has at least one word after its identifier.

	Reorder the logs so that all of the letter-logs come before any digit-log. 
 	The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  
 	The digit-logs should be put in their original order.

 * @author Sricheta's computer
 *
 */
public class ReorderLogFiles {

	public static void main(String[] args) {
		String[] logs = new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
		// "g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"
		reorder(logs);
	}

	private static void reorder(String[] logs) {
		
		Arrays.sort(logs, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
		           String[] split1 = s1.split(" ", 2);
		           String[] split2 = s2.split(" ", 2);
		           boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
		           boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
		           if(!isDigit1 && !isDigit2) {             
		             int comp = split1[1].compareTo(split2[1]);
		             if(comp != 0)
		              return comp;
		              return split1[0].compareTo(split2[0]);
		           }
		             return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
			}
			
		});
		
		
		
	}
}
