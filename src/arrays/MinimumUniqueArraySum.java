package arrays;

import java.util.Arrays;

public class MinimumUniqueArraySum {
	
	public static int findMinSumUniqueElements(int[] nums) {
		int minSum = 0;
		Arrays.sort(nums);
		int nextVal = nums[0] + 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= nums[i - 1]) {
				nums[i] = nextVal;
				minSum += nums[i];
				nextVal++;
			} else {
				nextVal = nums[i] + 1;
			}
		}
		return minSum;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 2};
		int result = findMinSumUniqueElements(nums);
		System.out.println(result);
	}

}
