package com.algonation.datastructure.tree;

public interface Tree<I> {

	public AbstractTreeNode<I> getRoot();
	public void add(I data);
} 
