/**
 * File created by csd on Nov 23, 2017
 * Given an array of n integers nums[] where n > 1, return output array such that output[i]
 * is equal to the product of all the elements of nums except nums[i].
 * without division and in O(n).
 */
package lc;

public class ProductOfArray {
	public static int[] productExceptSelf(int[] nums) {

		int[] output = new int[nums.length];
		// Arrays.fill(output, 1);
		int right = 1;
		// int left =1;
		// int j = nums.length-1;
		for (int i = 0; i < nums.length; i++) {
			output[i] = right;
			right *= nums[i];
		}
		right = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			output[i] *= right;
			right *= nums[i];
		}

		// combining all in one loop(requires to fill output array with 1s)
		// for(int i = 0; i< nums.length;i++,j--){
		// output[i] *= left;
		// output[j] *= right;
		// if(i!=nums.length){
		// left *=nums[i];
		// right *= nums[j];
		// }
		// }

		return output;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		nums = productExceptSelf(nums);
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
