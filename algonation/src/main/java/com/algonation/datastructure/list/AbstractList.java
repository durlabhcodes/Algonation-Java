package com.algonation.datastructure.list;

public abstract class AbstractList<K> implements List<K> {

	public int size(Object head) {
		int size = 0;
		@SuppressWarnings("unchecked")
		AbstractListNode<K> node = (AbstractListNode<K>) head;
		while (node != null) {
			node = node.next;
			size++;
		}

		return size;
	}
}
