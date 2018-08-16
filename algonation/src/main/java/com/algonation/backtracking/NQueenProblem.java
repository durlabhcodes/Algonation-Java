package com.algonation.backtracking;

public class NQueenProblem {

	public static int[][] getArrangement(int n) {
		int[][] board = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				board[i][j] = 0;
			}
		}
		
		solverUtil(board, n, 0);
		return board;
	}
	
	static boolean isValidPosition(int[][] board, int row, int col) {
		/* Check this row on left side */
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1)
				return false;
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}

		for (int i = row, j = col; j >= 0 && i < board.length; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}

		return true;
	}
	
	static boolean solverUtil(int[][] board, int n, int col) {
		if(col >=n ) {
			return true;
		}
		
		for(int i=0; i<n; i++) {
			
			if(isValidPosition(board, i, col)) {
				board[i][col] = 1;
				if(solverUtil(board, n, col+1)) {
					return true;
				}
				board[i][col] = 0;
			}
		}
		
		return false;
	}
}
