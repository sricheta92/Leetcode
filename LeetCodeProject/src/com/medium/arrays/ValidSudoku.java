package com.medium.arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	
	public static void main(String[] args) {

		char[][] arr  = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','5','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};
		
		System.out.println(isValidSudoku(arr));
	}
	
	
	public static boolean isValidSudoku(char[][] arr) {

		Set<Character> set = new HashSet<Character>();

		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				if (arr[i][j] != '.') {
					if(!set.add(arr[i][j])) {
						return false;
					}
				}
			}
			set.clear();
		}

		for(int j =0;j<arr.length;j++) {
			for(int i =0;i<arr[j].length;i++) {
				if (arr[i][j] != '.') {
					if(!set.add(arr[i][j])) {
						return false;
					}
				}
			}
			set.clear();
		}
		
		for(int i =0;i<arr.length;i++) {
			for( int j = i / 3*3;j<i/ 3*3 +3;j++) {
				for(int k = j%3*3;k< j%3*3 +3;k++) {
					if (arr[i][j] != '.') {
						if(!set.add(arr[i][j])) {
							return false;
						}
					}
				}
			}
			set.clear();
		}
		return true;
	}
}
