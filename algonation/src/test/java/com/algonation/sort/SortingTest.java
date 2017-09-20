package com.algonation.sort;
import org.junit.Assert;
import org.junit.Test;

import com.algonation.sort.factory.SorterFactory;
import com.algonation.sort.sorters.ISorter;
import com.algonation.util.AlgoUtil;

public class SortingTest {
	
	double[] input = { -10, 0.12, 141, 2, 9, 11, 16, 21, 334 };
	Double[] output = {new Double(-10), new Double(0.12), new Double(141), new Double(2), new Double(9), new Double(11), new Double(16), new Double(21), new Double(334)};
	String outputStr = "-10, 0.12, 2, 9, 11, 16, 21, 141, 334"; 
	ISorter sorter = null;
	
	@Test
	public void insertionSort() {
		sorter = SorterFactory.getSorter(1);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}
	
	@Test
	public void bubbleSort() {
		sorter = SorterFactory.getSorter(2);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}
	
	@Test
	public void selectionSort() {
		sorter = SorterFactory.getSorter(3);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}

	@Test
	public void mergeSort() {
		sorter = SorterFactory.getSorter(4);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}
	
	@Test
	public void quickSort() {
		sorter = SorterFactory.getSorter(5);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}

	@Test
	public void heapSort() {
		sorter = SorterFactory.getSorter(6);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}
	
	@Test
	public void countingSort() {
		sorter = SorterFactory.getSorter(7);
		Assert.assertEquals(outputStr, AlgoUtil.arrayToStr(sorter.sort(AlgoUtil.wrapDoubleArray(input))));
	}
}
