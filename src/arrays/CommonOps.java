package arrays;

import java.util.Arrays;

/*Find the maximum value of an element in an array*/

public class CommonOps {

	public static void main(String[] args) {
		//int[] nums = {2,5,6,0,1};
		int[] p = {3,4,5,9};
		//int[] q = {1,3,6,10,12};
		//System.out.println(maxValue(nums));
		//System.out.println(minValue(nums));
		//System.out.println(Arrays.toString(findMaxMin(nums)));
		//System.out.println(Arrays.toString(mergeSortedArrays(p, q)));
		//System.out.println(Arrays.toString(findPrefixSum(p)));
		System.out.println(Arrays.toString(reverse(p)));

	}
	
	//find max value in an array
	
	public static int maxValue(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//find min value in an array
	
	static int minValue(int[] nums) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		return min;
	}
	
	// find max and min in an array
	
	static int[] findMaxMin(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		return new int[] {max, min};
	}
	
	// Merge two sorted arrays
    
	static int[] mergeSortedArrays(int[] a, int[] b) {
		int m = a.length, n = b.length;
		int resLength = m+n;
		int[] arr = new int[resLength];
		int i = 0, j = 0, k = 0;
		
		while (i < m && j < n) {
			if (a[i] < b[j]) {
				arr[k++] = a[i++];
			} else {
				arr[k++] = b[j++];
			}	
		}
		while (i < m) {
			arr[k++] = a[i++];
		}
		while (j < n) {
			arr[k++] = b[j++];
		}
		return arr;
	}
	
	// find prefix sum
	
	static int[] findPrefixSum(int[] nums) {
		
		int prefixSum = 0;
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = prefixSum + nums[i];
			prefixSum = result[i];
		}
		return result;
	}
	
	// reverse an array
	
	static int[] reverse(int[] arr) {
		int low = 0, high = arr.length - 1;
		
		while (low < high) {
			swap(arr, low, high);
			low++;
			high--;
		}
		return arr;
	}	
	static void swap(int[] a, int low, int high) {
		int temp = a[low];
		a[low] = a[high];
		a[high] = temp;
	}

}
