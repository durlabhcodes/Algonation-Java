package com.algonation.sort.sorters;

import com.algonation.sort.util.SortUtil;

public class SelectionSort implements ISorter{

	@Override
	public Double[] sort(Double[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					SortUtil.swapByPosition(array, i, j);
				}
			}
		}
		return array;
	}

}
