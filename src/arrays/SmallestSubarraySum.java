package arrays;

/**
 * Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray
 *  whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
    Example 1:
	Input: [2, 1, 5, 2, 3, 2], S=7 
	Output: 2
	Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].
	Example 2:
	Input: [2, 1, 5, 2, 8], S=7 
	Output: 1
	Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].
	Example 3:
	Input: [3, 4, 1, 1, 6], S=8 
	Output: 3
	Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1] 
	or [1, 1, 6].
 * @author witha
 * Explanation:
 * 1. First add each elements with the windowSum untill it reaches greater than or equal to the given sum
 * 2. shrink the window, i.e. increment start pointer and subtract leaving element from the windowSum untill the windowSum is less than given sum
 * 3. track mininmum length of window
 * 
 * Time Complexity - O(N+N) = O(N)
 * Space Complexity - O(1)
 */

public class SmallestSubarraySum {
    public static int findSmallestSubarray(int sum, int[] arr) {
    	int start = 0;
    	int windowSum = 0;
    	int minLength = Integer.MAX_VALUE;
    	
    	for (int end = 0; end < arr.length; end++) {
    		windowSum += arr[end];
    		//shrink the window untill the windowSum is smaller than the sum
    		while (windowSum >= sum) {
    			minLength = Math.min(minLength, end - start + 1);
    			windowSum -= arr[start]; // remove element going out
    			start++;    // slide the window ahead
    		}
    	}
    	return minLength;
    }
	public static void main(String[] args) {
		int result = SmallestSubarraySum.findSmallestSubarray(7, new int[] { 2, 1, 5, 2, 3, 2 });
	    System.out.println("Smallest subarray length: " + result);
	    result = SmallestSubarraySum.findSmallestSubarray(7, new int[] { 2, 1, 5, 2, 8 });
	    System.out.println("Smallest subarray length: " + result);
	    result = SmallestSubarraySum.findSmallestSubarray(8, new int[] { 3, 4, 1, 1, 6 });
	    System.out.println("Smallest subarray length: " + result);
	}

}
