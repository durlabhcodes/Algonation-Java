package com.algonation.datastructure.tree;

public class BinaryTree<T> extends AbstractTree<T>{

	AbstractTreeNode<T> root;
	 boolean added;
	 
	class Node<N> extends AbstractTreeNode<N> {
		Node(N data, Node<N> left, Node<N> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	@Override
	public AbstractTreeNode<T> getRoot() {
		return root;
	}

	//Adds in Breadth first order.
	public void add(T data) {
		added = false;
		AbstractTreeNode<T> newNode = new Node<T>(data, null, null);
		if(root == null) {
			root = newNode;
			return;
		}
		
		add(data, root, newNode);
	}
	
	/*private boolean add(T data, AbstractTreeNode<T> node, AbstractTreeNode<T> newNode) {
		if(!added) {
			while(!added || node != null) {
				if(node.left == null) {
					node.left = newNode;
					added = true;
					return added;
				} else if(node.right == null) {
					node.right = newNode;
					added = true;
					return added;
				}
				if(node.left)
				added = add(data, node.left, newNode);
				if(added) break;
				added = add(data, node.right, newNode);
				if(added) break;
			}
		}
		return added;
	}*/
	
	private void add(T data, AbstractTreeNode<T> node, AbstractTreeNode<T> newNode) {
		
		
		if(node.left == null) {
			node.left = newNode;
			added = true;
		} else if(node.right == null) {
			node.right = newNode;
			added = true;
		}
		
		
	}
	
	public void inorderTraversal(AbstractTreeNode<T> node) {
		while(node != null) {
			inorderTraversal(node.left);
			System.out.println(node.data + " ");
			inorderTraversal(node.right);
		}
		
	}
}
