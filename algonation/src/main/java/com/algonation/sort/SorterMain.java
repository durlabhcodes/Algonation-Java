package com.algonation.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.algonation.sort.factory.SorterFactory;
import com.algonation.sort.sorters.ISorter;
import com.algonation.sort.util.SortUtil;

public class SorterMain {
	public static void main(String[] args) {

	//	double[] input = { 11, 21, 9, 16, 2, 0.12, 334, -10, 1 };
	//	double[] input = { -10, 0.12, 141, 2, 9, 11, 16, 21, 334 };
		
		double[] input = {1, 4, 1, 2, 7, 5, 2};
		ISorter sorter = SorterFactory.getSorter(7);
		Double[] inputArr = Arrays.stream(input).boxed().collect(Collectors.toList()).toArray(new Double[input.length]);
		SortUtil.printNumbers(sorter.sort(inputArr));
	}
	
	
}
