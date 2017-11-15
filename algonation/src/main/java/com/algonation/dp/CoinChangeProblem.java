package com.algonation.dp;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeProblem {
	
	public static int getCount(int[] inputArr, List<Integer> path, List<List<Integer>> pathList, int sum, int pointer) {
		
		if(pointer == inputArr.length-1) {
			path = new ArrayList<Integer>();
		}
		if(pointer < 0 || sum < 0) {
			path = null;
			return 0;
		}
		
		if(sum == 0) {
			path.add(inputArr[pointer]);
			pathList.add(path);
			path = new ArrayList<Integer>();
			return 1;
		}
		
		return getCount(inputArr, path, pathList, sum, pointer-1)+getCount(inputArr, path, pathList,sum-inputArr[pointer], pointer);
 	}
	
}
