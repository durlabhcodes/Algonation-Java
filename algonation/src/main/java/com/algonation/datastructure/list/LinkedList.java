package com.algonation.datastructure.list;

public class LinkedList<K> implements List<K>{

	Node<K> head;
	
	public class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data) {
			this.data = data;
			this.next = null;
		}
		
		@Override
		public String toString() {
			return this.data.toString();
		}
	}
	
	@Override
	public void add(K element) {
		if(head == null) {
			head = new Node<K>(element);
		} else {
			Node<K> node = new Node<K>(element);
			Node<K> lastNode = head;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			
			lastNode.next = node;
		}
	}
	
	@Override
	public void addFirst(K element) {
		Node<K> newNode = new Node<K>(element);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	@Override
	public void add(int index, K element) {
		Node<K> node = head;
		Node<K> newNode = new Node<K>(element);
		int counter = 0;
		
		if(index ==0) {
			addFirst(element);
		}
		while(counter<index-1) {
			node = node.next;
			counter++;
			if(node == null) {
				throw new ArrayIndexOutOfBoundsException("Index Out Of List Size");
			}
		}
		
		Node<K> nextNode = node.next;
		node.next = newNode;
		newNode.next = nextNode;
	}
	
	@Override
	public void remove(int index) {
		int counter = 0;
		Node<K> node = head;
		Node<K> previousNode = null;
		if(index == 0) {
			removeFirst();
			return;
		}
		while(counter!=index) {
			if(counter == index-2) {
				previousNode = node.next;
			}
			node = node.next;
			if(node == null) {
				throw new ArrayIndexOutOfBoundsException("Index Out Of List Size");
			}
			counter++;
		}
		Node<K> nextNode = node.next;
		
		previousNode.next = nextNode;
	}
	
	@Override
	public void removeFirst() {
		head = head.next;
	}
	
	@Override
	public void removeLast() {
		Node<K> currentNode = head;
		Node<K> previousNode = null;
		if(currentNode ==null) {
			return;
		}
		while(currentNode.next!=null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = null;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("[");
		Node<K> node = head;
		if(node==null) {
			return null;
		}
		while(node!=null) {
			buffer.append(node.data+", ");
			node = node.next;
		}
		return buffer.toString().substring(0,buffer.length()-2)+"]";
	}
	
}
