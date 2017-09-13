package com.algonation.sorting.sorters;

public class MergeSort implements ISorter {

	@Override
	public Double[] sort(Double[] array) {
		int n = array.length;
		if(n>1) {
			int mid = n/2;
			Double[] left = new Double[mid];
			Double[] right = new Double[n-mid];
			
			for(int l=0; l<mid; l++) {
				left[l] = array[l];
			}
			
			for(int r=0; r<n-mid; r++) {
				right[r] = array[mid+r];
			}
			
			sort(left);
			sort(right);
			
			int l_counter=0, r_counter=0,main_counter=0;
			
			while(l_counter<mid && r_counter<n-mid) {
				if(left[l_counter] > right[r_counter]) {
					array[main_counter] = right[r_counter];
					main_counter++;
					r_counter++;
				} else {
					array[main_counter] = left[l_counter];
					main_counter++;
					l_counter++;
				}
				
			}
			
			while(l_counter<mid) {
				array[main_counter] = left[l_counter];
				main_counter++;
				l_counter++;
			}
			
			while(r_counter<n-mid) {
				array[main_counter] = right[r_counter];
				main_counter++;
				r_counter++;
			}
		}
		return array;
	}

}
