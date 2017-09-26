package com.algonation.datastructure;

import org.junit.Assert;
import org.junit.Test;

import com.algonation.datastructure.tree.BinaryTree;
import com.algonation.datastructure.tree.Tree;
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
	
	private Tree<Integer> generateTestTree() {
		Tree<Integer> tree = new BinaryTree<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		tree.add(7);
		return tree;
	}
	
	@Test
	public void inorderTest() {
		generateTestTree();
	}


}
