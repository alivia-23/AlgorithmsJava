package arrays;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
   A subarray is a contiguous part of an array.
   
   Example 1:
	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
	
	Example 2:
	Input: nums = [1]
	Output: 1
	
	Example 3:
	Input: nums = [5,4,-1,7,8]
    Output: 23
 * @author witha
 * 
 *  Time Complexity - O(N) As we iterate through every element only once
 *  Space Complexity - O(1) As we are not using any space 
 *
 */

public class MaximumSumSubArray {
	
	public static int maxSubArraySum(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int curSum = nums[0];
		int maxSum = nums[0];
		
		//loop through the second element then add and compare
		for (int i = 1; i < nums.length; i++) {
			//compare with incoming element and sum of prev element plus incoming element whichever is max update it in curSum
			curSum = Math.max(nums[i], curSum + nums[i]);
			maxSum = Math.max(curSum, maxSum); //update maxSum as well
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int result = maxSubArraySum(nums);
		System.out.println(result);

	}

}
