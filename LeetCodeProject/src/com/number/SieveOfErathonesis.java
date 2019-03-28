package com.number;

public class SieveOfErathonesis {

	public static void main(String[] args) {
		countPrimes(5);
	}

	private static void countPrimes(int n) {
		// TODO Auto-generated method stub
		
		boolean[] primes = new boolean[n];
		int count =0;
		for(int i =2; i<n;i++ ) {
			if(!primes[i]) {
				count++;
				for(int j =2; i*j<n;j++) {
					primes[i*j] = true;
				}
			}
		}
		System.out.println(count);
		
	}
}
