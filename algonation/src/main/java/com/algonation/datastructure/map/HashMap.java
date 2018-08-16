package com.algonation.datastructure.map;

public class HashMap<K, V> extends AbstractMap<K, V> {
	
	Node<K, V>[] table = (Node<K, V>[])new Node[16];

	public void put(K key, V value) {
		Node<K, V> node = new Node<K, V>(key, value);
		
		
	}
	
	final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
	
}
