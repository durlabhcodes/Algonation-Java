package com.algonation.datastructure;

import org.junit.Assert;
import org.junit.Test;

import com.algonation.datastructure.list.util.ListUtils;
import com.algonation.datastructure.tree.BinaryTree;
import com.algonation.datastructure.tree.util.TreeUtils;

public class TreeTest {

	private Integer[] postOrder = {4, 5, 2, 6, 7, 3, 1};
	private Integer[] preOrder = {1, 2, 4, 5, 3, 6, 7};
	private Integer[] inOrder = {4, 2, 5, 1, 6, 3, 7};
	private Integer[] levelOrder = {1, 2, 3, 4, 5, 6, 7};
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
	
	@Test
	public void inorderTest() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>().dummyTree();
		Assert.assertEquals(ListUtils.arrayToList(inOrder), tree.inOrderTraversal(tree.getRoot()));
	}

	@Test
	public void preOrderTest() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>().dummyTree();
		Assert.assertEquals(ListUtils.arrayToList(preOrder), tree.preOrderTraversal(tree.getRoot()));
	}
	
	@Test
	public void levelOrderTest() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>().dummyTree();
		Assert.assertEquals(ListUtils.arrayToList(levelOrder), tree.levelOrderTraversal(tree.getRoot()));
	}
	
	@Test
	public void postOrderTest() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>().dummyTree();
		Assert.assertEquals(ListUtils.arrayToList(postOrder), tree.postOrderTraversal(tree.getRoot()));
	}

}
