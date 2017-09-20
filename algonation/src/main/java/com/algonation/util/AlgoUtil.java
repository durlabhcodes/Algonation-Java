package com.algonation.util;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AlgoUtil {

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
	public static String arrayToStr(Double[] input) {
		StringBuffer sbr = new StringBuffer();
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
		for (int i = 0; i < input.length; i++) {
			sbr.append(format.format(input[i]) + ", ");
		}
		return sbr.toString().trim().substring(0, sbr.length()-2);
	}
	
	public static Double[] wrapDoubleArray(double[] input) {
		return Arrays.stream(input).boxed().collect(Collectors.toList()).toArray(new Double[input.length]);
	}
}
