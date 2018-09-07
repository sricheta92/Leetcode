package com.String;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
	
	public static void main(String[] args) {
		uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"});
	}

	private static void uniqueMorseRepresentations(String[] words) {
		
String[] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        //String[] letters = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Set<String> set = new HashSet<String>();
        for(int i =0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j =0;j<words[i].toCharArray().length;j++){
               // letters.indexOf(words[i].toCharArray()[j])
                sb.append(arr[words[i].toCharArray()[j]-97]);
            }
            
            set.add(sb.toString());
        }
		
        System.out.println(set.size());
	}

}
