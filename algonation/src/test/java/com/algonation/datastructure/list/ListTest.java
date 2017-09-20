package com.algonation.datastructure.list;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {
	List<Integer> linkedList = null;
	List<Integer> dlinkedList = null;
	
	public List<Integer> generateInitialList() {
		List<Integer> actualList = new LinkedList<Integer>();
		actualList.add(1);
		actualList.add(2);
		actualList.add(3);
		actualList.add(4);
		return actualList;
	}
	
	public List<Integer> generateInitialDList() {
		List<Integer> actualList = new DoublyLinkedList<Integer>();
		actualList.add(1);
		actualList.add(2);
		actualList.add(3);
		actualList.add(4);
		return actualList;
	}
	@Test
	public void addList(){
		List<Integer> actualList = generateInitialList();
		linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		Assert.assertEquals(linkedList, actualList);
	}
	@Test
	public void addDList(){
		List<Integer> actualList = generateInitialDList();
		dlinkedList = new DoublyLinkedList<Integer>();
		dlinkedList.add(1);
		dlinkedList.add(2);
		dlinkedList.add(3);
		dlinkedList.add(4);
		
		Assert.assertEquals(dlinkedList, actualList);
	}
	
	
	@Test
	public void addFirstList(){
		linkedList = generateInitialList();
		linkedList.addFirst(-1);
		Assert.assertEquals(linkedList.toString(), "[-1, 1, 2, 3, 4]");
	}
	@Test
	public void addFirstDList(){
		dlinkedList = generateInitialDList();
		dlinkedList.addFirst(-1);
		Assert.assertEquals(dlinkedList.toString(), "[-1, 1, 2, 3, 4]");
	}
	
	@Test
	public void addByIndexList(){
		linkedList = generateInitialList();
		linkedList.add(2, -1);
		Assert.assertEquals(linkedList.toString(), "[1, 2, -1, 3, 4]");
	}
	@Test
	public void addByIndexDList(){
		dlinkedList = generateInitialDList();
		dlinkedList.add(2, -1);
		Assert.assertEquals(dlinkedList.toString(), "[1, 2, -1, 3, 4]");
	}
	
	@Test
	public void removeList(){
		linkedList = generateInitialList();
		linkedList.remove(2);
		Assert.assertEquals(linkedList.toString(), "[1, 2, 4]");
	}
	@Test
	public void removeDList(){
		dlinkedList = generateInitialDList();
		dlinkedList.remove(2);
		Assert.assertEquals(dlinkedList.toString(), "[1, 2, 4]");
	}
	
	@Test
	public void removeFirstList(){
		linkedList = generateInitialList();
		linkedList.removeFirst();
		Assert.assertEquals(linkedList.toString(), "[2, 3, 4]");
	}
	@Test
	public void removeFirstDList(){
		dlinkedList = generateInitialDList();
		dlinkedList.removeFirst();
		Assert.assertEquals(dlinkedList.toString(), "[2, 3, 4]");
	}
	
	@Test
	public void removeLastList(){
		linkedList = generateInitialList();
		linkedList.removeLast();
		Assert.assertEquals(linkedList.toString(), "[1, 2, 3]");
	}
	@Test
	public void removeLastDList(){
		dlinkedList = generateInitialDList();
		dlinkedList.removeLast();
		Assert.assertEquals(dlinkedList.toString(), "[1, 2, 3]");
	}
	
	@Test
	public void sizeList(){
		linkedList = generateInitialList();
		Assert.assertEquals(linkedList.size(), 4);
	}
	@Test
	public void sizeDList(){
		dlinkedList = generateInitialDList();
		Assert.assertEquals(dlinkedList.size(), 4);
	}
	
}
