package com.algonation.sort.sorters;

import com.algonation.sort.util.SortUtil;

public class BubbleSort implements ISorter {

	@Override
	public Double[] sort(Double[] array) {
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					SortUtil.swapByPosition(array, j, j+1);
				}
			}
		return array;
	}
}
