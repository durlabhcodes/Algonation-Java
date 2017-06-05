package com.algonation.sorting.sorters;

public class InsertionSort implements ISorter{
	
	@Override
	public double[] sort(double[] array) {
		int N = array.length;
		for(int j=1;j<N;j++) {
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
