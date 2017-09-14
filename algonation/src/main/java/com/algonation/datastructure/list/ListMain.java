package com.algonation.datastructure.list;

public class ListMain {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.remove(6);
		System.out.println(l);
		
	}
}
