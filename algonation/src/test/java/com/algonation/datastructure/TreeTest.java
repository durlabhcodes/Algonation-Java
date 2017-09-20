package com.algonation.datastructure;

import org.junit.Assert;
import org.junit.Test;

import com.algonation.datastructure.tree.util.TreeUtils;

public class TreeTest {

	
	@Test
	public void maxNodesByLevelTest() {
		int[] level = {5, 1, 0, -2};
		int[] nodes = {16, 1, 0, 0};
		for(int i=0;i<level.length; i++) {
			Assert.assertEquals(TreeUtils.maxNodesByLevel(level[i]), nodes[i]);
		}
	}
	
	@Test
	public void maxNodesByHeightTest() {
		int[] height = {5, 1, 0, -2};
		int[] nodes = {31, 1, 0, 0};
		for(int i=0;i<height.length; i++) {
			Assert.assertEquals(TreeUtils.maxNodesByHeight(height[i]), nodes[i]);
		}
	}
}
