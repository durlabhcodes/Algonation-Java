package com.algonation.sorting;

import java.text.DecimalFormat;

import com.algonation.sorting.factory.SorterFactory;
import com.algonation.sorting.sorters.ISorter;

public class SorterMain {
	public static void main(String[] args) {

		double[] input = { 11, 21, 9, 16, 2, 0.12, 334, -10, 1 };
		ISorter sorter = SorterFactory.getSorter(1);
		printNumbers(sorter.sort(input));
	}
	
	private static void printNumbers(double[] input) {
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
		for (int i = 0; i < input.length; i++) {
			System.out.print(format.format(input[i]) + ", ");
		}
		System.out.println("\n");
	}
}
