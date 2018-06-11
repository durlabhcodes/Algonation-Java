package com.algonation.dp;

public class LIS {

	/*int[][] input = {{10,40},
					 {11,20},
					 {39,40},
					 {45,60}};*/
	public int lisLength(int[] input) {
		int[] res = new int[input.length];
		
		for(int i=0; i<res.length; i++) {
			res[i] = 1;
		}
		
		for(int i=1; i<res.length; i++) {
			for(int j = 0; j<i; j++) {
				if((input[j] < input[i]) && ((res[j]+1)> res[i])) {
					res[i] = res[j]+1;
				}
			}
		}
		
		int max = 0;
		for(int i=0; i<res.length; i++) {
			if(res[i] > max) {
				max = res[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] lisInput = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		LIS l = new LIS();
		int res =l.lisLength(lisInput);
		System.out.println(res);
	}
}
