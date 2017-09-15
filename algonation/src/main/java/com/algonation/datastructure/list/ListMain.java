package com.algonation.datastructure.list;

public class ListMain {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		System.out.println(l+"Size = "+l.size());
		
		l.addFirst(10);
		System.out.println(l+"Size = "+l.size());
		
		l.add(2, 11);
		System.out.println(l+"Size = "+l.size());
		
		l.remove(5);
		System.out.println(l+"Size = "+l.size());
		
		l.removeFirst();
		System.out.println(l+"Size = "+l.size());
		
		l.removeLast();
		System.out.println(l+"Size = "+l.size());
		
	}
}
