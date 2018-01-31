package com.algonation.datastructure.map;

public interface Entry<K, V> {

	public K getKey();
	public void setKey(K key);
	
	public V getValue();
	public void setValue(V value);
	
}
