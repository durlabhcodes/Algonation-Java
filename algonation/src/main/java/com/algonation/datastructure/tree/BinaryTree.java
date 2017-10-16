package com.algonation.datastructure.tree;

import java.util.Queue;

import com.algonation.datastructure.list.LinkedList;
import com.algonation.datastructure.list.List;

public class BinaryTree<T> extends AbstractTree<T>{

	AbstractTreeNode<T> root;
	List<T> list = new LinkedList<T>();
	
	class Node<N> extends AbstractTreeNode<N> {
		Node(N data, Node<N> left, Node<N> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		Node(N data) {
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	@Override
	public Node<T> getNewNode(T data) {
		return new Node<T>(data, null, null);
	}
	
	@Override
	public AbstractTreeNode<T> getRoot() {
		return root;
	}
	
	public void setRoot(AbstractTreeNode<T> node) {
		if(root == null) {
			root = node;
		}
	}
	@Override
	public void setRoot(AbstractTreeNode<T> node, boolean updateRoot) {
		if(updateRoot) {
			root = node;
		} else {
			setRoot(node);
		}
	}
	
	@Override
	public List<T> inOrderTraversal(AbstractTreeNode<T> node) {
		while(node!=null) {
			inOrderTraversal(node.left);
			list.add(node.data);
			inOrderTraversal(node.right);
			break;
		}
		return list;
	}
	
	@Override
	public List<T> preOrderTraversal(AbstractTreeNode<T> node) {
		while(node!=null) {
			list.add(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
			break;
		}
		return list;
	}
	
	@Override
	public List<T> postOrderTraversal(AbstractTreeNode<T> node) {
		while(node!=null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			list.add(node.data);
			break;
		}
		return list;
	}
	
	@Override
	public List<T> levelOrderTraversal(AbstractTreeNode<T> node) {
		Queue<AbstractTreeNode<T>> queue = new java.util.LinkedList<AbstractTreeNode<T>>();
		while(node!= null) {
			list.add(node.data);
			queue.add(node.left);
			queue.add(node.right);
			node = queue.poll();
		}
		return list;
	}
	public BinaryTree<Integer> dummyTree() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.root = new Node<Integer>(1);
		tree.root.left = new Node<Integer>(2);
		tree.root.right = new Node<Integer>(3);
		tree.root.left.left = new Node<Integer>(4);
		tree.root.left.right = new Node<Integer>(5);
		tree.root.right.left= new Node<Integer>(6);
		tree.root.right.right= new Node<Integer>(7);
		return tree;
	}
}
