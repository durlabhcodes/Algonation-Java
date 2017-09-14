package com.algonation.datastructure.list;

public class DoublyLinkedList<K> implements List<K> {
	
	Node<K> head;
	
	public class Node<T> {
		T element;
		Node<T> next, previous;
		
		Node(T element) {
			this.element = element;
			this.next = null;
			this.previous = null;
		}
		
		@Override
		public String toString() {
			return this.element.toString();
		}
	}

	@Override
	public void add(K element) {
		if(head==null) {
			head = new Node<K>(element);
		} else {
			Node<K> newNode = new Node<K>(element);
			Node<K> node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next=newNode;
			newNode.previous=node;
		}
		
	}

	@Override
	public void addFirst(K element) {
		Node<K> newNode = new Node<K>(element);
		head.previous = newNode;
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void add(int index, K element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		
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
}
