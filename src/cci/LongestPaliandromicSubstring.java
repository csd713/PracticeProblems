/**
 * File created by csd on May 20, 2018
 */
package cci;

public class LongestPaliandromicSubstring {

	public static void main(String[] args) {

		System.out.println(longestPalindrome("cabcba"));
		System.out.println(longestPalindrome("bbbbbbb"));
		System.out.println(longestPalindrome("a"));
		System.out.println(longestPalindrome("madam"));
		System.out.println(longestPalindrome("12121"));

	}

	public static String longestPalindrome(String s) {
		String paliandrome = "";
		int maxLen = 0;
		if (s.length() == 1)
			return s;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {
				String curStr = s.substring(i, j);
				int curLen = isPaliandrome(curStr);
				if (curLen > maxLen) {
					maxLen = curLen;
					paliandrome = curStr;
				}
			}
		}
		return paliandrome;
	}

	public static int isPaliandrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {
				return 0;
			}
		}
		return len;
	}

}
