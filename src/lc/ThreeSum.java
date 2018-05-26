/**
 * File created by csd on May 24, 2018
 * 
 * LC15 - Three sum
 */

package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(arr));

	}

	public static List<List<Integer>> threeSum(int[] a) {
		List<List<Integer>> finalList = new ArrayList<>();
		// sort the given array - Very important to sort it
		Arrays.sort(a);

		for (int i = 0; i < a.length - 2; i++) {

			if (i == 0 || a[i] > a[i - 1]) {
				int start = i + 1;
				int end = a.length - 1;

				while (start < end) {
					int sum = a[i] + a[start] + a[end];

					if (sum == 0) {
						// List<Integer> pairs = new ArrayList<>();
						// pairs.add(a[i]);
						// pairs.add(a[start]);
						// pairs.add(a[end]);
						// finalList.add(pairs);
						finalList.add(Arrays.asList(a[i], a[start], a[end]));
					}

					if (sum < 0) {
						int curStart = start;
						while (a[start] == a[curStart] && start < end) {
							start++;
						}
					} else {
						int curEnd = end;
						while (a[end] == a[curEnd] && start < end) {
							end--;
						}
					}
				}
			}
		}
		return finalList;
	}

}
