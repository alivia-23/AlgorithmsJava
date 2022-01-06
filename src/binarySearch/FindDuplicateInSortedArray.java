package binarySearch;

public class FindDuplicateInSortedArray {
	public static int duplicateNumber(int[] nums) {
	    //TODO: Write - Your - Code
	    int low = 0;
	    int high = nums.length;

	    while (low <= high) {
	      int mid = low + (high - low) / 2;
	      if (nums[mid] == nums[mid-1]) {
	          return nums[mid];
	      } else if (nums[mid] == mid) {
	          high = mid;
	      } else {
	          low = mid;
	      }
	    }
	    return nums[low];
	  }
	public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5,6,7};
        int result = duplicateNumber(nums);
        System.out.println(result);
	}

}
