package com.algonation.sorting.factory;

import com.algonation.sorting.sorters.BubbleSort;
import com.algonation.sorting.sorters.HeapSort;
import com.algonation.sorting.sorters.ISorter;
import com.algonation.sorting.sorters.InsertionSort;
import com.algonation.sorting.sorters.MergeSort;
import com.algonation.sorting.sorters.QuickSort;
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
		case 5:
			return new QuickSort();
		case 6:
			return new HeapSort();
		default:
			return null;
		}
	}
}
