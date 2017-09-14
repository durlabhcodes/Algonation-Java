package com.algonation.datastructure.list;

public class ListMain {

	public static void main(String[] args) {
		List<Integer> l = new DoublyLinkedList<Integer>();
		
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.addFirst(6);
		System.out.println(l);
		
	}
}
