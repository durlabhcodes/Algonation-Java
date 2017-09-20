package com.algonation.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {

	int size;
	Node<K,V> head;
	Node<K,V> tail;
	Map<K,Node<K,V>> dataMap = new HashMap<K,Node<K,V>>(size);
	
	public LRUCache(int size) {
		this.size = size;
	}
	
	@SuppressWarnings("hiding")
	class Node<K, V> {
		K key;
		V value;
		Node<K,V> next;
		Node<K,V> previous;
		
		Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public void setHead(Node<K,V> node){
		if(head != null) {
			node.next = head;
			node.next.previous = node;
		}
		
		head = node;
		
		if(tail==null) {
			tail = head;
		}
	}
	
	public void remove(Node<K,V> node) {
		if(node.previous!=null) {
			node.previous.next = node.next;
		} else {
			head = node.next;
		}
		if(node.next!=null) {
			node.next.previous = node.previous;
		} else {
			tail = node.previous;
		}
		
	}
	public void put(K key, V value) {
		Node<K, V> node = new Node<K, V>(key, value);
		if(dataMap.containsKey(key)) {
			remove(node);
		} else {
			if(dataMap.size()>=size) {
				dataMap.remove(tail.key);
				remove(tail);
			}
		}
		setHead(node);
		dataMap.put(key, node);
	}
	
	public V get(K key) {
		if(dataMap.containsKey(key)) {
			Node<K, V> node = dataMap.get(key);
			remove(node);
			setHead(node);
			return node.value;
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuffer sbr = new StringBuffer("[");
		Node<K,V> node = head;
		while(node!=null) {
			sbr.append(node.key+":"+node.value+", ");
			node = node.next;
		}
		
		return sbr.toString().trim().substring(0, sbr.length()-2)+"]";
	}
	
	
}
