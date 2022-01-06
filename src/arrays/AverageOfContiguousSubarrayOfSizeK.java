package arrays;

import java.util.Arrays;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 * @author witha
 * 
 * In this approach we will remember the sum of current window and subtract the starting element when we move on to the next window by adding next element to it
 * Time Complexity = O(N)
 * Space complexity = O(N)
 */

public class AverageOfContiguousSubarrayOfSizeK {
	public static double[] findAverage(int k, int[] arr) {
		double[] result = new double[arr.length - k + 1];
		int start = 0;
		double windowSum = 0;
		for (int end = 0; end < arr.length; end++) {
			windowSum += arr[end];   // calculate windowSum
			if (end >= k - 1) { // if we have reached the window size then calculate windowsum average and put in result 
				result[start] = windowSum / k;  // calculate average
				windowSum -= arr[start];   // subtract start index element from windowSum
				start++;               // increment start pointer
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	    double[] result = AverageOfContiguousSubarrayOfSizeK.findAverage(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
	    System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
	  }

}
