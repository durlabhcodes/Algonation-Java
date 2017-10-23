package com.algonation.dp;

public class LongestCommonSubsequence {

	public int getLength(String str1, String str2) {
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		int len1 = charArr1.length;
		int len2 = charArr2.length;
		
		if(len1 == 0 || len2 == 0) {
			return 0;
		}
		
		if(charArr1[len1-1] == charArr2[len2-1]) {
			System.out.println("1 + "+str1.substring(0,len1-1) + " & "+str2.substring(0,len2-1));
			return 1+getLength(str1.substring(0,len1-1), str2.substring(0,len2-1));
		} else {
			System.out.println("Comparing "+str1.substring(0,len1-1) + " & "+str2.substring(0,len2-1)+ " with "+str1.substring(0,len1) + " & "+str2.substring(0,len2-1));
			return Math.max(getLength(str1.substring(0,len1-1), str2.substring(0,len2)), getLength(str1.substring(0,len1), str2.substring(0,len2-1)));
		}
		
	}
}
