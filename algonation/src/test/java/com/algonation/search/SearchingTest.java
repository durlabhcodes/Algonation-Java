package com.algonation.search;

import org.junit.Assert;
import org.junit.Test;

import com.algonation.search.factory.SearchFactory;
import com.algonation.search.searchers.ISearcher;
import com.algonation.util.AlgoUtil;

public class SearchingTest {

	double[] input = {-10, 0.12, 141, 2, 9, 11, 16, 21, 334 };
	double elementNotPresent = 0.112;
	double elementPresent = 0.12;
	

	@Test
	public void linearSearchPositive() {
		ISearcher searcher = SearchFactory.getSearcher(1);
		Assert.assertNotEquals(-1, searcher.search(AlgoUtil.wrapDoubleArray(input), elementPresent));
	}
	@Test
	public void linearSearchNegative() {
		ISearcher searcher = SearchFactory.getSearcher(1);
		Assert.assertEquals(-1, searcher.search(AlgoUtil.wrapDoubleArray(input), elementNotPresent));
	}
	@Test
	public void linearSearchPosition() {
		ISearcher searcher = SearchFactory.getSearcher(1);
		Assert.assertEquals(1, searcher.search(AlgoUtil.wrapDoubleArray(input), elementPresent));
	}
	
	@Test
	public void binarySearchPositive(){
		ISearcher searcher = SearchFactory.getSearcher(2);
		Assert.assertNotEquals(-1, searcher.search(AlgoUtil.wrapDoubleArray(input), elementPresent));
	}
	@Test
	public void binarySearchNegative(){
		ISearcher searcher = SearchFactory.getSearcher(2);
		Assert.assertEquals(-1, searcher.search(AlgoUtil.wrapDoubleArray(input), elementNotPresent));
	}
	@Test
	public void BinarySearchPosition() {
		ISearcher searcher = SearchFactory.getSearcher(1);
		Assert.assertEquals(1, searcher.search(AlgoUtil.wrapDoubleArray(input), elementPresent));
	}
	
}
