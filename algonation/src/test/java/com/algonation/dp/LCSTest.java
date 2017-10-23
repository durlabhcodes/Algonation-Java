package com.algonation.dp;

import org.junit.Assert;
import org.junit.Test;

public class LCSTest {

	String str1 = "ABCDGH";
	String str2 = "AEDFHR";
	
	@Test
	public void lengthTest(){
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		Assert.assertEquals(3,lcs.getLength(str1, str2));
	}
}
