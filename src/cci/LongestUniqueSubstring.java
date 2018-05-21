/**
 * File created by csd on May 20, 2018
 */

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
package cci;

public class LongestUniqueSubstring {

	public static void main(String[] args) {

		System.out.println("abcdefgh : " + lengthOfLongestSubstring("abcdefgh"));
		System.out.println("nbgfev : " + lengthOfLongestSubstring("nbgfev"));
		System.out.println("chiranjeevi : " + lengthOfLongestSubstring("chiranjeevi"));
		System.out.println("dhananjaya : " + lengthOfLongestSubstring("dhananjaya"));
	}

	// Brute force technique
	public static int lengthOfLongestSubstring(String s) {

		String maxStr = "";
		int maxLen = 0;
		int sLen = s.length();
		if (sLen <= 1)
			return sLen;

		for (int i = 0; i < sLen; i++) {
			String str = "";
			for (int j = i + 1; j < sLen + 1; j++) {
				char c = s.charAt(j - 1);
				if (str.indexOf(c) >= 0) {
					break;
				}
				str = s.substring(i, j);

				if (str.length() > maxLen) {
					maxStr = str;
					maxLen = str.length();
				}
			}
		}
		// System.out.print(maxStr + " : ");
		return maxLen;
	}

}
