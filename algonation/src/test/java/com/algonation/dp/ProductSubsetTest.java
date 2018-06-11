package com.algonation.dp;

import org.junit.Assert;
import org.junit.Test;

public class ProductSubsetTest {

	int[] input = {4, 8, 7, 2};
	int k = 50;
	
	@Test
	public void countWithLesserProductTest(){ 
		ProductSubset ps = new ProductSubset();
		Assert.assertEquals(9, ps.countWithLesserProduct(input, k));
	}
}
