package com.algonation.datastructure.list;

public class DoublyLinkedList<K> implements List<K> {
	
	Node<K> head;
	
	public class Node<T> {
		T element;
		Node<T> next;
		Node<T> previous;
		
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
		// TODO Auto-generated method stub
		
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

}
