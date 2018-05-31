package com.algonation.dp;

import java.util.LinkedList;
import java.util.List;

public class SumSubset {

	public int sumSubsetCountRecursive(int[] input, int n, int sum) {
		if(sum == 0) {
			return 1;
		}
		
		if(n == 0) {
			return 0;
		}
		
		return sumSubsetCountRecursive(input, n-1, sum-input[n-1]) + sumSubsetCountRecursive(input, n-1, sum);
	}
	
	public int sumPairSubsetCount(int[] input, int n, int sum) {
		boolean[] resultArr = new boolean[100];
		int result = 0;
		for(int i=0;i<input.length; i++) {
			if(resultArr[sum-input[i]]) {
				result++;
			}
			
			resultArr[input[i]] = true;
		}
		return result;
	}
	
	public int duplicatePairCount(int[] input, int sum) {
		int[] resultArr = new int[100];
		int result = 0;
		
		for(int i=0; i<input.length; i++) {
			if(resultArr[Math.abs(input[i])] <0) {
				result++;
			}
			resultArr[Math.abs(input[i])] = -Math.abs(input[i]);
		}
		
		return result;
	}
	
	public int duplicatePairCount2(int[] input, int sum) {
		boolean[] resultArr = new boolean[100];
		int result = 0;
		for(int i=0;i<input.length; i++) {
			if(resultArr[input[i]]) {
				result++;
			}
			resultArr[input[i]] = true;
		}
		return result;
	}
	
	public List<List<Integer>> printAllSumSubset(int[] input, int n, int sum) {
		if(sum == 0) {
			List<List<Integer>> finalResult = new LinkedList<>();
			finalResult.add(new LinkedList<>());
			return finalResult;
		}
		
		if(n >= input.length || sum<0) {
			return null;
		}
		
		List<List<Integer>> finalResult = new LinkedList<>();
		
		List<List<Integer>> withoutCurrent = printAllSumSubset(input, n+1, sum);
		if(withoutCurrent!=null) {
			finalResult.addAll(withoutCurrent);
		}
		
		List<List<Integer>> withCurrent = printAllSumSubset(input, n+1, sum-input[n]);
		if(withCurrent != null) {
			for(List<Integer> l : withCurrent) {
				l.add(0, input[n]);
				finalResult.add(l);
			}
		}
		
		return finalResult;
	}
	
}
