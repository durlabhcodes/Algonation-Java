package com.algonation.sorting.sorters;

import com.algonation.sorting.util.SortUtil;

public class HeapSort implements ISorter {

	@Override
	public Double[] sort(Double[] array) {
		heapSort(array);
		return array;
	}
	
	private void heapSort(Double[] array) {
		int len = array.length;
		for(int i=(len/2-1); i>=0; i--) {
			heapify(array, len, i);
		}
		
		for(int i=len-1; i>=0; i--) {
			SortUtil.swapByPosition(array, i, 0);
			heapify(array, i, 0);
		}
		
	}
	private void heapify(Double[] array, int len, int i) {
		int largest = i;
		int left = (2*i)+1;
		int right = (2*i)+2;
		
		if(left < len && array[left] > array[largest]) {
			largest = left;
		}
		if(right < len && array[right] > array[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			SortUtil.swapByPosition(array, i, largest);
			heapify(array, len, largest);
		}
		
		
	}
	
	
}
