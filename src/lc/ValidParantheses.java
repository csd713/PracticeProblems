/**
 * File created by csd on Nov 7, 2017
 * determine if the input string has valid parantheses sequence
 */
package lc;

public class ValidParantheses {

	public static void main(String[] args) {

		ValidParantheses obj = new ValidParantheses();

		if (obj.hasValidParantheses("[()]{()}"))
			System.out.println("YES!");
		else
			System.out.println("NO");
	}

	public boolean hasValidParantheses(String string) {

		char[] arr = new char[string.length()/2+1]; //use half of the size
		int j = 0;

		for (int i = 0; i < string.length(); i++) {

			switch (string.charAt(i)) {
			case '(':
			case '{':
			case '[':
				arr[j] = string.charAt(i);
				j++;
				break;
			case ')':
				if (j == 0) {
					return false;
				}
				if (arr[j - 1] == '(') {
					j--;
				} else {
					return false;
				}
				break;
			case '}':
				if (j == 0) {
					return false;
				}
				if (arr[j - 1] == '{') {
					j--;
				} else {
					return false;
				}
				break;
			case ']':
				if (j == 0) {
					return false;
				}
				if (arr[j - 1] == '[') {
					j--;
				} else {
					return false;
				}
				break;
			default:
				return false;
			}

		}
		if (j != 0) {
			return false;
		}
		return true;
	}
}