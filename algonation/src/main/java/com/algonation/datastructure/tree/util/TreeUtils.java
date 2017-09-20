package com.algonation.datastructure.tree.util;

public class TreeUtils {

	public static int maxNodesByLevel(int level){
		if(level>0) {
			return (int)Math.pow(2, level-1);
		}
		return 0;
	}
	
	public static int maxNodesByHeight(int height) {
		if(height>0) {
			return (int)(Math.pow(2, height)-1);
		}
		return 0;
	}
}
