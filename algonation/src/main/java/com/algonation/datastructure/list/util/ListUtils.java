package com.algonation.datastructure.list.util;

import com.algonation.datastructure.list.DoublyLinkedList;
import com.algonation.datastructure.list.LinkedList;
import com.algonation.datastructure.list.List;

public class ListUtils {

	public static <K> List<K> arrayToList(K[] array) {
		return arrayToList(array, null);
	}
	@SuppressWarnings("rawtypes")
	public static <K> List<K> arrayToList(K[] array, Class clazz) {
		List<K> list;
		if(clazz == null || !clazz.equals(DoublyLinkedList.class)) {
			list = new LinkedList<K>();
		} else {
			list = new DoublyLinkedList<K>();
		}
		 
		for(K element : array) {
			list.add(element);
		}
		return list;
	}
}
