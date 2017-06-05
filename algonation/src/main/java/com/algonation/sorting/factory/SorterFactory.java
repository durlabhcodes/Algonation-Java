package com.algonation.sorting.factory;

import com.algonation.sorting.sorters.BubbleSort;
import com.algonation.sorting.sorters.ISorter;
import com.algonation.sorting.sorters.InsertionSort;

public class SorterFactory {

	public static ISorter getSorter(int sortId){
		switch(sortId) {
		case 1: 
			return new InsertionSort();
		case 2:
			return new BubbleSort();
		default:
			return null;
		}
	}
}
