package com.algonation.dp;

import java.util.ArrayList;
import java.util.List;

public class GoldMineProblem {

	public int maxProfit(int[][] arr) {
		int maxCol = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i][0] > arr[maxCol][0]) {
				maxCol = i;
			}
		}
		return maxProfit(arr, maxCol, 0);
	}
	
	private int maxProfit(int[][] arr, int row, int col) {
		if(col == arr[0].length || row == arr.length || row < 0) {
			return 0;
		}
		
		return arr[row][col] + Math.max(maxProfit(arr, row-1, col+1), maxProfit(arr, row + 1, col + 1));
	}
	
	public List<Integer> maxProfitPath(int[][] arr) {
		int maxRow = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i][0] > arr[maxRow][0]) {
				maxRow = i;
			}
		}
		
		List<Integer> res = maxProfitPath(arr, maxRow, 0, null);
		return res;
	}

	private List<Integer> maxProfitPath(int[][] arr, int row, int col, List<Integer> res) {
		if(col == arr[0].length || row == arr.length || row < 0) {
			return new ArrayList<Integer>();
		}
		
		List<Integer> newList = new ArrayList<>();
		List<Integer> upRight = maxProfitPath(arr, row-1, col+1, res); 
		List<Integer> downRight = maxProfitPath(arr, row + 1, col + 1, res);
		
		if(sumOfElememts(upRight) > sumOfElememts(downRight)) {
			newList.addAll(upRight);
			newList.add(arr[row][col]);
		} else {
			newList.addAll(downRight);
			newList.add(arr[row][col]);
		}
		
		return newList;
	}
	
	private int sumOfElememts(List<Integer> inp) {
		int sum = 0;
		
		for(Integer i:inp) {
			sum+=i;
		}
		
		return sum;
	}
}
