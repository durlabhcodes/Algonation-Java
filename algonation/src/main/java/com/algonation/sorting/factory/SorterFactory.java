package com.algonation.sorting.factory;

import com.algonation.sorting.sorters.BubbleSort;
import com.algonation.sorting.sorters.ISorter;
import com.algonation.sorting.sorters.InsertionSort;
import com.algonation.sorting.sorters.MergeSort;
import com.algonation.sorting.sorters.SelectionSort;

public class SorterFactory {

	public static ISorter getSorter(int sortId){
		switch(sortId) {
		case 1: 
			return new InsertionSort();
		case 2:
			return new BubbleSort();
		case 3:
			return new SelectionSort();
		case 4:
			return new MergeSort();
		default:
			return null;
		}
	}
}
