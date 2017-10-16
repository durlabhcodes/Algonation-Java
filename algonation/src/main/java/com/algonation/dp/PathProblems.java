package com.algonation.dp;

public class PathProblems {

	static int[][] matrixWeight = {
							{1,   2,   3,  4}, 
							{5,   6,   7,  8},
							{9,  10,  11, 12},
							{13, 14,  15, 16}
							};
	public static int pathCount(int m, int n) {
		if(m<1 || n<1) {
			return 0;
		}
		if(m==1 || n==1) {
			return 1;
		}
		
		return pathCount(m-1, n)+pathCount(m, n-1);
	}
	public static void printAllPaths(int m, int n, int initX, int initY) {
		if(m==initX || n==initY) {
			return;
		}
		System.out.println(matrixWeight[initX][initY]);
		printAllPaths(m, n, initX+1, initY);
		printAllPaths(m, n, initX, initY+1);
		/*System.out.println("Path : " +matrixWeight[initX][initY]);*/
	}
}
