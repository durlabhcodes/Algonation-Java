package com.algonation.datastructure.map;

public abstract class AbstractMap<K, V> implements Map<K, V> {
	protected int size; 
	
	public class Node<K, V> implements Entry<K, V> {
		private K key;
		private V value;
		
		Node<K, V> next;
		
		public Node() {
			
		}
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public void setKey(K key) {
			this.key = key;			
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public void setValue(V value) {
			this.value = value;
		}
		
		public Node<K, V> getNext() {
			return next;
		}

		public void setNext(Node<K, V> next) {
			this.next = next;
		}

	}
	
	public int getSize() {
		return size;
	}
}
