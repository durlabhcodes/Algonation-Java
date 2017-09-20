package com.algonation.datastructure.list;

public abstract class AbstractList<K> implements List<K> {

	public int size(Object head) {
		int size = 0;
		if(head instanceof List) {
			@SuppressWarnings("unchecked")
			List<K> list = (List<K>) head;
			AbstractListNode<K> node = list.getHead();	
			while (node != null) {
				node = node.next;
				size++;
			}
			return size;
		}
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Object currentListObj, Object toCompareListObj) {
		List<K> currentList = (List<K>) currentListObj;
		List<K> toCompareList = (List<K>) toCompareListObj;
		AbstractListNode<K> node1 = currentList.getHead();
		AbstractListNode<K> node2 = toCompareList.getHead();
		while(node1 != null) {
			if(node1.element != node2.element) {
				return false;
			} else {
				node1 = node1.next;
				node2 = node2.next;
			}
		}
		
		return true;
	}
	
	
}
