package com.algonation.dp;

public class CoinChangeProblem {
	
	public static int getCount(int[] inputArr, int sum, int pointer) {
		
		if(pointer < 0 || sum < 0) {
			return 0;
		}
		
		if(sum == 0) {
			return 1;
		}
		
		return getCount(inputArr, sum, pointer-1)+getCount(inputArr, sum-inputArr[pointer], pointer);
 	}
	
}
