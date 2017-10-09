package com.algonation.datastructure.tree;

import com.algonation.datastructure.list.List;

public interface Tree<I> {

	public AbstractTreeNode<I> getRoot();
	public AbstractTreeNode<I> getNewNode(I data);
	public void setRoot(AbstractTreeNode<I> node, boolean updateRoot);
	public List<I> inOrderTraversal(AbstractTreeNode<I> node);
	public List<I> preOrderTraversal(AbstractTreeNode<I> node);
	public List<I> postOrderTraversal(AbstractTreeNode<I> node);
	
} 
