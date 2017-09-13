package com.algonation.sort.sorters;

public class InsertionSort implements ISorter{
	
	@Override
	public Double[] sort(Double[] array) {
		for(int j=1;j<array.length;j++) {
			double key = array[j];
			int i = j-1;
			while((i>-1) && (array[i] > key)) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1] = key;
		}
		return array;
	}
}
