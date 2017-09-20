package com.algonation.cache;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void LRUCache() {
		LRUCache<Integer, String> cache = new LRUCache<Integer, String>(4);
		cache.put(1, "Durlabh");
		cache.put(2, "Mittal");
		cache.put(3, "Karan");
		cache.put(4, "Mandeep");
		cache.put(5, "Sandeep");
		Assert.assertEquals(cache.toString(), "[5:Sandeep, 4:Mandeep, 3:Karan, 2:Mittal]" );
		cache.get(3);
		Assert.assertEquals(cache.toString(), "[3:Karan, 5:Sandeep, 4:Mandeep, 2:Mittal]" );
		cache.put(6, "Naveen");
		Assert.assertEquals(cache.toString(), "[6:Naveen, 3:Karan, 5:Sandeep, 4:Mandeep]" );
		cache.get(3);
		Assert.assertEquals(cache.toString(), "[3:Karan, 6:Naveen, 5:Sandeep, 4:Mandeep]" );
		cache.get(10);
	}
}
