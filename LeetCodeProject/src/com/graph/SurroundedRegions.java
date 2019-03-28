package com.graph;

public class SurroundedRegions {
	
	public static void main(String[] args) {
		
	
		char[][] arr = {{'X', 'X', 'X', 'X'},
				{'X', 'O', 'O', 'X'}, 
				{'X', 'X', 'O', 'X'},
				{'X', 'O', 'X', 'X'}};
		solve(arr);
	}
	
	//char[][] static  board1 = null;
	static int[][]  dirs = {{0,1}, {0,-1}, {-1, 0}, {1,1}};
    public static void solve(char[][] board) {
        if(board == null || board.length ==0 ){
            return;
        }
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
     //   board1 = board;
        for(int i =1;i<m-1;i++){
            for(int j =1;j<n-1; j++){
                solveUtil(board, visited, i, j);
            }
        }
        
    
        
    }
    
    public  static void solveUtil(char[][] board , boolean[][] visited, int i , int j){
        if(i<0 || i>= board.length || j<0 || j>= board[i].length || visited[i][j] == true){
            return;
        }
        visited[i][j] = true;
        if(board[i][j] == 'O' && isAllNeighbursX(board, i, j)){
            board[i][j] = 'X';
        }
        for(int[] x: dirs) {
			solveUtil(board, visited, x[0], x[i]);
		}
        
        
    }
    
    public static boolean isAllNeighbursX(char[][] board, int i , int j){
       if(board[i-1][j] == 'X' && board[i][j-1] == 'X' && board[i+1][j]=='X' && board[i][j+1] =='X' ){
           return true;
       }else{
           return false;
       }
    }

}
