package arrays;

/**
 * Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
 * 
 *  Input: [2, 1, 5, 1, 3, 2], k=3 
	Output: 9
	Explanation: Subarray with maximum sum is [5, 1, 3].
	
	Input: [2, 3, 4, 1, 5], k=2 
	Output: 7
	Explanation: Subarray with maximum sum is [3, 4].
 * @author witha
 *
 */

public class MaxSumSubarrayOfSizeK {
	
	//Brute Force Approach
	//calculate the sum of all k sized subarrays of the given array
	//we start with every index of the given array and add the next k elements to find the subarray's sum
	// Time Complexity is O(N * K) as N represents number of elements in the array and k represents the window elements of size k
	public static int findMaxSumSubarray(int k, int[] nums) {
		int maxSum = 0; 
		int windowSum = 0;
		
		for (int i = 0; i < nums.length - k; i++) {
			windowSum = 0;
			for (int j = i; j < i+k; j++) {
				windowSum += nums[j];
			}
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
	
	// Optimized sliding window approach
	public static int maxSumSubarrayOfSizeK(int k, int[] arr) {
		int windowSum = 0;
		int start = 0;
		int maxSum = 0;
		for (int end = 0; end < arr.length; end++) {
			windowSum += arr[end];  // add elements 
			
			if  (end >= k - 1) {    // if end pointer reached window size of k
				 maxSum = Math.max(maxSum, windowSum); // calculate maximum of windowSum and maxSum
				 windowSum -= arr[start];   // remove(subtract) start element from windowsum
				 start++;    // slide the window ahead
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		//Brute force approach
		System.out.println("Maximum sum of a subarray of size K: "
		        + MaxSumSubarrayOfSizeK.findMaxSumSubarray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
		System.out.println("Maximum sum of a subarray of size K: "
		        + MaxSumSubarrayOfSizeK.findMaxSumSubarray(2, new int[] { 2, 3, 4, 1, 5 }));
		
		//Optimized approach
		System.out.println("Maximum sum of a subarray of size K: "
		        + MaxSumSubarrayOfSizeK.maxSumSubarrayOfSizeK(3, new int[] { 2, 1, 5, 1, 3, 2 }));
		System.out.println("Maximum sum of a subarray of size K: "
		        + MaxSumSubarrayOfSizeK.maxSumSubarrayOfSizeK(2, new int[] { 2, 3, 4, 1, 5 }));

	}

}
