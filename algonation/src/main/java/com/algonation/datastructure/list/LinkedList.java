package com.algonation.datastructure.list;

public class LinkedList<K> extends AbstractList<K>{

	Node<K> head;
	
	public class Node<T> extends AbstractListNode<T> {
		Node<T> next;
		
		Node(T element) {
			this.element = element;
			this.next = (Node<T>) super.next;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
			super.next = next;
		}
		@Override
		public String toString() {
			return this.element.toString();
		}
	}
	
	public AbstractListNode<K> getHead() {
		return head;
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
			
			lastNode.setNext(node);
		}
	}
	
	@Override
	public void addFirst(K element) {
		Node<K> newNode = new Node<K>(element);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.setNext(head);
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
		node.setNext(newNode);
		newNode.setNext(nextNode);
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
		
		previousNode.setNext(nextNode);
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
		previousNode.setNext(null);
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("[");
		Node<K> node = head;
		if(node==null) {
			return null;
		}
		while(node!=null) {
			buffer.append(node.element+", ");
			node = node.next;
		}
		return buffer.toString().substring(0,buffer.length()-2)+"]";
	}
	
	@Override
	public int size() {
		return super.size(this);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof List)) {
			return false;
		}
 		List<K> toMatch = (List<K>) obj;
		if(this.size() != toMatch.size()) {
			return false;
		}
		return super.equals(this, toMatch);
	}
	
}
