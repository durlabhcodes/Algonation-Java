package com.algonation.sort.sorters;

import com.algonation.util.AlgoUtil;

public class QuickSort implements ISorter {
int count=0;
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
		System.out.println("Partition call count"+(++count));
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
				AlgoUtil.swapByPosition(array, low, high);
			}
		}
		AlgoUtil.swapByPosition(array, low, right);
		return low;
	}
	
	

}
