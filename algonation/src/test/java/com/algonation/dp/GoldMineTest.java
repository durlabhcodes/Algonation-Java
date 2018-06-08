package com.algonation.dp;

import org.junit.Assert;
import org.junit.Test;

public class GoldMineTest {

	int[][] arr = { {1, 3, 1, 5},
            {2, 2, 4, 1},
            {5, 0, 2, 3},
            {0, 6, 1, 2}};
	
	@Test
	public void maxProfitTest() {
		Assert.assertEquals(15, GoldMineProblem.maxProfit(arr));
	}
}
