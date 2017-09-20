package com.algonation.datastructure.list;

public interface List<E> {
	
	public AbstractListNode<E> getHead();
	public void add(E element);
	public void addFirst(E element);
	public void add(int index, E element);
	public void remove(int index);
	public void removeFirst();
	public void removeLast();
	public int size();
}
