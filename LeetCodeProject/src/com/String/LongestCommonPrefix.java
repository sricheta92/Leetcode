package com.String;

/**
 * O(NMlogM)
 * @author Sricheta's computer
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		findLongestCommonPrefix(new String[]{"flower","flow","flight"});
	}

	private static void findLongestCommonPrefix(String[] arr) {
		
		//String min = getMinimumLength(arr);
		String minString = "";
		int min = Integer.MAX_VALUE;
		for(String s : arr) {
			if(s.length()<min) {
				min = s.length();
				minString = s;
			}
		}
		
		int low = 0;
		int high = min;
		String prefix ="";
		
		while(low<=high) {			
			int mid = low + (high-low)/2;			
			if(allContainPrefixes(arr, low, mid, minString)) {
				prefix = prefix+ minString.substring(low, mid-low);
				low = mid+1;
			}
			else {
				high = mid-1; 
			}
		}		
		System.out.println(prefix);
	}

	private static boolean allContainPrefixes(String[] arr, int start, int end, String minString) {
		
		int n = arr.length;
		for (int i = 0; i <= (n - 1); i++)
        {
            String arr_i = arr[i];
             
            for (int j = start; j <end; j++)
                if (arr_i.charAt(j) != minString.charAt(j))
                    return false;
        }
        return true;
		
	}

	private static String getMinimumLength(String[] arr) {
		
		int min = Integer.MAX_VALUE;
		String minString = "";
		for(String s : arr) {
			if(s.length()<min) {
				min = s.length();
				minString = s;
			}
		}
		
		return minString;
		
	}
}
