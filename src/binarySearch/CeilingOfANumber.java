package binarySearch;

public class CeilingOfANumber {

	public static void main(String[] args) {
		System.out.println(ceilingOfNumber(new int[] { 4, 6, 10 }, 6));
	    System.out.println(ceilingOfNumber(new int[] { 1, 3, 8, 10, 15 }, 12));
	    System.out.println(ceilingOfNumber(new int[] { 4, 6, 10 }, 17));
	    System.out.println(ceilingOfNumber(new int[] { 4, 6, 10 }, -1));

	}
	
	public static int ceilingOfNumber(int[] nums, int target) {
		int low = 0; int high = nums.length - 1;
		
		if (target < nums[low]) return low;
		if (target > nums[high]) return -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return low;
	}

}
