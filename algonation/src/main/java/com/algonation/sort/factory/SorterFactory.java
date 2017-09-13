package com.algonation.sort.factory;

import com.algonation.sort.sorters.BubbleSort;
import com.algonation.sort.sorters.HeapSort;
import com.algonation.sort.sorters.ISorter;
import com.algonation.sort.sorters.InsertionSort;
import com.algonation.sort.sorters.MergeSort;
import com.algonation.sort.sorters.QuickSort;
import com.algonation.sort.sorters.SelectionSort;

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
