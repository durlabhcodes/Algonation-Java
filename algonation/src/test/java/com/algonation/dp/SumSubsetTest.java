package com.algonation.dp;

import org.junit.Assert;
import org.junit.Test;

public class SumSubsetTest {
	
	SumSubset ss = new SumSubset();
	int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int[] dupInput = { 1, 3, 3, 4, 5, 4, 7, 1 };
	
	@Test
	public void givenSumSubsetCount() {
		Assert.assertEquals(ss.sumSubsetCountRecursive(input, input.length, 8), 6);
	}
	
	@Test
	public void duplicatePairCount() {
		Assert.assertEquals(ss.duplicatePairCount(dupInput, 8), 3);
		Assert.assertEquals(ss.duplicatePairCount2(dupInput, 8), 3);
	}
	
	@Test
	public void sumPairCount() {
		Assert.assertEquals(ss.sumPairSubsetCount(input, input.length, 8), 3);
	}
	
	
}
