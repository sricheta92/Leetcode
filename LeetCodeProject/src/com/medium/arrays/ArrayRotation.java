package com.medium.arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		leftrotateArrayByD(new int[] {1, 2, 3, 4, 5, 6, 7},2 );
		
	}

	private static void leftrotateArrayByD(int[] arr, int d) {
		
		int gcd = gcd(arr.length,d);
		
		int temp, j, k;
		for(int i=0;i<gcd;i++) {
			
			temp = arr[i];
			j =i;
			while(true) {
				k = j+d;
				if(k>=arr.length) {
					k = k -arr.length;
				}
				if( k == i) {
					break;
				}
			    arr[j] = arr[k];
			    j =k;
			}
			arr[j]  = temp;
			
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	private static  int  gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
}
