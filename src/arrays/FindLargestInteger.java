package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Write a function that, given an array A of N integers, returns the lagest integer K > 0 such that both values K and -K exist in array A. 
 * If there is no such integer, the function should return 0.
	Example 1:
	Input: [3, 2, -2, 5, -3]
	Output: 3
	Example 2:
	Input: [1, 2, 3, -4]
	Output: 0
 *
 */
public class FindLargestInteger {
	
	public static int findLargestInteger(int[] nums) {
		
		//Brute force
		/*
		int maxVal = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == -nums[i] && nums[i] > maxVal) {
					maxVal = Math.abs(nums[i]);
				}
			}
		}
		return maxVal;*/
		
		//Optimized Time complexity - O(nlogn) and space complexity - O(1)
		/*Arrays.sort(nums);
		int low = 0;
		int high = nums.length - 1;
		while (low < high) {
			if (nums[low] == -nums[high]) {
				return nums[high];
			} else if (Math.abs(nums[low]) < nums[high]) {
				high--;
			} else {
				low++;
			}
		}
		return 0;*/
		
		//More optimized using set where time complexity - O(nlogn) and space complexity - O(n)
		Set<Integer> set = new HashSet<>();
		int maxVal = 0;
		for (int num : nums) {
			if (set.contains(-num)) {
				maxVal = Math.max(maxVal, Math.abs(num));
			}
			set.add(num);
		}
		return maxVal;
	}

	public static void main(String[] args) {
		int[] nums = {3, 2, -2, 5, -3};
		int result = findLargestInteger(nums);
        System.out.println(result);
	}

}
