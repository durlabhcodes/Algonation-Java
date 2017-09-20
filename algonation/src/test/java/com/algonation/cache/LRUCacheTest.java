package com.algonation.cache;

import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void LRUCacheTest() {
		LRUCache<Integer, String> cache = new LRUCache<Integer, String>(4);
		cache.put(1, "Durlabh");
		cache.put(2, "Mittal");
		cache.put(3, "Karan");
		cache.put(4, "Mandeep");
		cache.put(5, "Sandeep");
		System.out.println(cache);
		cache.get(3);
		cache.put(6, "Naveen");
		cache.get(3);
		System.out.println(cache);
	}
}
