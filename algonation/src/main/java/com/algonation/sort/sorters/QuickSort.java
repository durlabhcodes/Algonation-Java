package com.algonation.sort.sorters;

import com.algonation.sort.util.SortUtil;

public class QuickSort implements ISorter {

	@Override
	public Double[] sort(Double[] array) {
		
		int len = array.length;
		int low = 0;
		int high = len-1;
		quickSort(array, low, high);
		
		return array;
	}

	private void quickSort(Double[] array, int low, int high) {
		
		if(low<high) {
			int partition = partition(array, low, high);
			quickSort(array, low, partition-1);
			quickSort(array, partition+1, high);
		}
	}
	private int partition(Double[] array, int low, int right) {
		Double pivot = array[right];
		int high=right-1;
		while(true) {
			while(array[low] < pivot && low<=high) {
				low++;
			}
			while(array[high] > pivot && low<=high) {
				high--;
			}
			
			if(low>high) {
				break;
			} else {
				SortUtil.swapByPosition(array, low, high);
			}
		}
		SortUtil.swapByPosition(array, low, right);
		return low;
	}
	
	

}
