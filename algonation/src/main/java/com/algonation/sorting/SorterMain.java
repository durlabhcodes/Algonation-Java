package com.algonation.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.algonation.sorting.factory.SorterFactory;
import com.algonation.sorting.sorters.ISorter;
import com.algonation.sorting.util.SortUtil;

public class SorterMain {
	public static void main(String[] args) {

	//	double[] input = { 11, 21, 9, 16, 2, 0.12, 334, -10, 1 };
		double[] input = { -10, 0.12, 141, 2, 9, 11, 16, 21, 334 };
		ISorter sorter = SorterFactory.getSorter(4);
		Double[] inputArr = Arrays.stream(input).boxed().collect(Collectors.toList()).toArray(new Double[input.length]);
		SortUtil.printNumbers(sorter.sort(inputArr));
	}
	
	
}
