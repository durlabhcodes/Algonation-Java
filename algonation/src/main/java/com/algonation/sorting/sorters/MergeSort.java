package com.algonation.sorting.sorters;

public class MergeSort implements ISorter {

	@Override
	public Double[] sort(Double[] array) {
		int n = array.length;
		if (n > 1) {
			int mid = n >> 1;
			Double[] left = new Double[mid];
			Double[] right = new Double[n - mid];
			for (int i = 0; i < mid; i++) {
				left[i] = array[i];
			}
			for (int i = mid; i < n; i++) {
				right[i - mid] = array[i];
			}

			sort(left);
			sort(right);

			int a = 0, b = 0, c = 0;

			while (a < mid && b < (n - mid)) {
				if (left[a] > right[b]) {
					array[c] = right[b];
					b++;
				} else {
					array[c] = left[a];
					a++;
				}
				c++;
			}

			while (a < mid) {
				array[c] = left[a];
				c++;
				a++;
			}
			while (b < n - mid) {
				array[c] = right[b];
				b++;
				a++;
			}
		}
		return array;
	}

}
