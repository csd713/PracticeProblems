/**
 * File created by csd on May 23, 2018
 *
 * Convert String to Integer - LC 8
 */
package lc;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(myAtoi("          -23abc"));
		System.out.println(myAtoi("abcd25abc"));
		System.out.println(myAtoi("-91283472332"));
		System.out.println(myAtoi("+-23"));
		System.out.println(myAtoi("5.144"));
		System.out.println(myAtoi("23232323"));
		System.out.println(myAtoi("---23"));
		System.out.println(myAtoi(" "));
	}

	public static int myAtoi(String str) {

		int number = 0, index = 0, sign = 1;
		// trim spaces
		str = str.trim();

		// Check if input is empty
		if (str.length() == 0)
			return 0;

		// Check for signs
		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}

		for (int i = index; i < str.length(); i++) {
			// Convert to digit
			int digit = (int) str.charAt(i) - 48;
			if (digit < 0 || digit > 9)
				break;

			// check for overflow
			if (Integer.MAX_VALUE / 10 < number || Integer.MAX_VALUE / 10 == number && Integer.MAX_VALUE % 10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			number = 10 * number + digit;
		}
		return sign * number;
	}
}
