package com.algonation.sorting.util;

import java.text.DecimalFormat;

public class SortUtil {

	public static final <T> void swapByPosition(T[] arr, int index1, int index2) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void printNumbers(Double[] input) {
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
		for (int i = 0; i < input.length; i++) {
			System.out.print(format.format(input[i]) + ", ");
		}
		System.out.println("\n");
	}
}
