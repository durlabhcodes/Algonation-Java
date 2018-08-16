package com.algonation.search.searchers;

public class LinearSearch implements ISearcher {

	public int search(Double[] array, Double element) {
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

}