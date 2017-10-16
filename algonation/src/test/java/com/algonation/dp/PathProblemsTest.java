package com.algonation.dp;

import org.junit.Assert;
import org.junit.Test;
public class PathProblemsTest {

	@Test
	public void pathCountTest() {
		Assert.assertEquals(PathProblems.pathCount(3, 3), 6);
		Assert.assertEquals(PathProblems.pathCount(0, 0), 0);
		Assert.assertEquals(PathProblems.pathCount(1, 2), 1);
		Assert.assertEquals(PathProblems.pathCount(2, 2), 2);
		Assert.assertEquals(PathProblems.pathCount(3, 2), 3);
		Assert.assertEquals(PathProblems.pathCount(4, 3), 10);
	}
	
	@Test
	public void paths() {
		PathProblems.printAllPaths(4, 3, 0, 0);
	}
}
