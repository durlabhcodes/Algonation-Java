package com.algonation.search;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.algonation.search.factory.SearchFactory;
import com.algonation.search.searchers.ISearcher;

public class SearchingMain {
	
	public static void main(String[] args) {
		double[] input = {-10, 0.12, 141, 2, 9, 11, 16, 21, 334 };
		double element = 21;
		ISearcher searcher = SearchFactory.getSearcher(1);
		Double[] array = Arrays.stream(input).boxed().collect(Collectors.toList()).toArray(new Double[input.length]);
		int position = searcher.search(array, element);
		System.out.println(position==-1 ? "Not Present" : "Present at index : "+position);
	}

}
