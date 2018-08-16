package com.algonation.search.searchers;

import com.algonation.sort.factory.SorterFactory;

public class BinarySearch implements ISearcher {

	public int search(Double[] array, Double element) {
		array = SorterFactory.getSorter(4).sort(array);
		return binarySearch(array, element, 0, array.length-1);
	}
	
	public int binarySearch(Double[] array, Double element, int lowerBound, int upperBound) {
		if(lowerBound<upperBound){
			int mid = (lowerBound+upperBound)>>1;
			if(array[mid].equals(element)) {
				return mid;
			} else if(array[mid]>element){
				return binarySearch(array, element,lowerBound, mid);
			} else {
				return binarySearch(array, element, mid+1, upperBound);
			}
		}
		
		return -1;
	}
}
