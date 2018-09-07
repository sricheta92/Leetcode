package com.String;

public class KMPAlgorithm {

	public static void main(String[] args) {

		kmpAlgorithm("osyedeose", "ose");

	}

	private static void kmpAlgorithm(String text, String pat) {

		//compute LPS array
		int[] lps = computerlpsArray(pat);
		int j =0;
		int i =0;
		
		while(i<text.length()) {
			
			if(text.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			}
			
			if(j == pat.length()) {
				System.out.println("pattern found at "+(i-j));
				
				j = lps[j-1];
			}
			else if (i<text.length() && text.charAt(i) != pat.charAt(j)) {
				if( j !=0) {
					j = lps[j-1];
				}else {
					i++;
				}
			}
			
			
			
			
			
		}



	}

	private static int[] computerlpsArray(String pat) {


		int[] lps = new int[pat.length()];
		int len = 0;
		lps[0] =0;
		int i =1;
		while(i<pat.length()) {

			if(pat.charAt(i)!= pat.charAt(len)) {
				if(len ==0) {
					lps[i] = 0;
					i++;
				}else {
					len = lps[len-1];
				}

			}else {
				len++;
				lps[i]= len;
				i++;
			}

		}
		return lps;
	}
}
