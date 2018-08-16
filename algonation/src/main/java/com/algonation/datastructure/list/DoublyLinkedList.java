package com.algonation.datastructure.list;

public class DoublyLinkedList<K> extends AbstractList<K> {
	
	Node<K> head;
	
	public class Node<T> extends AbstractListNode<T> {
		Node<T> next, previous;
		
		
		Node(T element) {
			this.element = element;
			this.next = (Node<T>) super.next;
			this.previous = null;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
			super.next = next;
		}
		
		public String toString() {
			return this.element.toString();
		}
	}

	public AbstractListNode<K> getHead() {
		return head;
	}
	
	public void add(K element) {
		if(head==null) {
			head = new Node<K>(element);
		} else {
			Node<K> newNode = new Node<K>(element);
			Node<K> node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.setNext(newNode);
			
			newNode.previous=node;
		}
		
	}

	
	public void addFirst(K element) {
		Node<K> newNode = new Node<K>(element);
		head.previous = newNode;
		newNode.setNext(head);
		head = newNode;
	}

	
	public void add(int index, K element) {
		int counter = 1;
		Node<K> node = head;
		if(index == 0) {
			addFirst(element);
			return;
		}
		while(index!=counter) {
			node = node.next;
			counter++;
			if(node == null) {
				throw new ArrayIndexOutOfBoundsException("Index Out Of List Size");
			}
		}
		Node<K> newNode = new Node<K>(element);
		newNode.previous = node;
		newNode.setNext(node.next);
		node.setNext(newNode);
		newNode.next.previous = newNode;
	}

	
	public void remove(int index) {
		int counter = 0;
		if(index == 0) {
			removeFirst();
			return;
		}
		
		Node<K> node = head;
		while(index!=counter) {
			node = node.next;
			counter++;
			if(node == null) {
				throw new ArrayIndexOutOfBoundsException("Index Out Of List Size");
			}
		}
		
		node.previous.setNext(node.next);
		if(node.next != null){
			node.next.previous = node.previous;
		}
	}

	
	public void removeFirst() {
		Node<K> node = head.next;
		node.previous = null;
		head.setNext(null);
		head = node;
		
	}

	
	public void removeLast() {
		Node<K> node = head;
		while(node.next!=null) {
			node = node.next;
		}
		Node<K> previousNode = node.previous;
		previousNode.setNext(null);
		node.previous = null;
	}
	
	
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
	
	
	public int size() {
		return super.size(this);
	}
	
	@SuppressWarnings("unchecked")
	
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
