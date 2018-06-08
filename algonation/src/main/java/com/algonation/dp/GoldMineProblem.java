package com.algonation.dp;

public class GoldMineProblem {

	public static int maxProfit(int[][] arr) {
		int maxCol = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i][0] > arr[maxCol][0]) {
				maxCol = i;
			}
		}
		return maxProfit(arr, maxCol, 0);
	}
	
	private static int maxProfit(int[][] arr, int row, int col) {
		if(col == arr[0].length || row == arr.length || row < 0) {
			return 0;
		}
		
		return arr[row][col] + Math.max(maxProfit(arr, row-1, col+1), maxProfit(arr, row + 1, col + 1));
	}
	
}
