package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-45, 1, 4, 8, 12, 25, 36, 50};
		int target = 36;	
		int result = binarySearch(arr, target);		
		System.out.println("index:" +result);

	}
	
	public static int binarySearch(int[] nums, int target) {		
		if(nums.length == 0) {
			return -1;
		}	
		int low = 0, high = nums.length - 1;		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if (target == nums[mid]) return mid;
			
			else if(target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
