package com.algonation.search.factory;

import com.algonation.search.searchers.BinarySearch;
import com.algonation.search.searchers.ISearcher;
import com.algonation.search.searchers.LinearSearch;

public class SearchFactory {

	public static ISearcher getSearcher(int id) {
		switch(id) {
			case 1:
				return new LinearSearch();
			case 2:
				return new BinarySearch();
			default:
				return null;
		}
			
	}
}
