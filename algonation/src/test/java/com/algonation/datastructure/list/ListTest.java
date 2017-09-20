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
		
	}
	
	
	@Test
	public void addFirstList(){
		
	}
	@Test
	public void addFirstDList(){
		
	}
	
	@Test
	public void addByIndexList(){
		
	}
	@Test
	public void addByIndexDList(){
		
	}
	
	@Test
	public void removeList(){
		
	}
	@Test
	public void removeDList(){
		
	}
	
	@Test
	public void removeFirstList(){
		
	}
	@Test
	public void removeFirstDList(){
		
	}
	
	@Test
	public void removeListList(){
		
	}
	@Test
	public void removeLastDList(){
		
	}
	
	@Test
	public void sizeList(){
		
	}
	@Test
	public void sizeDList(){
		
	}
	
}
