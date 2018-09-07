package com.String;

public class GoatLatin {

	public static void main(String[] args) {
		
		toGoatLatin("The quick brown fox jumped over the lazy dog");
		
	}

	private static void toGoatLatin(String S) {
			
			String vowel = "aeiou";
			String[] arr = S.split(" ");
			StringBuilder sb = new StringBuilder();
			int count=0;
			for(String word : arr) {
				if(vowel.contains(word.charAt(0)+"")){
					sb.append(word);
					sb.append("ma");
				}else {
					sb.append(word.substring(1));
					sb.append(word.substring(0,1));
					sb.append("ma");
				}
				
				count++;
				for(int i=0;i<count;i++) {
					sb.append("a");
				}
				sb.append(" ");	
			}
			
		
		System.out.println(sb.toString());
		
	}
	

}
