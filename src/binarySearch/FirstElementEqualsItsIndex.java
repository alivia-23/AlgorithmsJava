package binarySearch;
/**
 * Suppose we are given a sorted array of distinct integers, nums, which are sorted in ascending order. We will return the smallest index i, 
 * which satisfies nums[i] == i. If no such i exists, we will return -1.
 * Example 1:
 *  Input: [-10,-5,0,3,7]    
    Output: 3 
   Example 2:
    Input: [0,2,5,8,17]    
    Output: 0 
   Example 3:
    Input: [-10,-5,3,4,7,9]    
    Output: -1    
 * @author witha
 *
 */
public class FirstElementEqualsItsIndex {
	
	public static int findEqualNum(int[] nums) {
		int low = 0;
		int high = nums.length;
		while (low+1 < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == mid && low < nums[low]) {
				return mid;
			} else if (nums[mid] < mid) {
				low = mid;
			} else {
				high = mid;
			}
			
		}
		if (nums[low] == low) {
			return low;
		}
		if (high < nums.length && nums[high] == high) {
			return high;
		}
		return -1;
	}

	public static void main(String[] args) {
        int[] nums = {-10,-5,0,3,7};
        int result = findEqualNum(nums);
        System.out.println(result);
        int[] nums1 = {0,2,5,8,17};
        int result1 = findEqualNum(nums1);
        System.out.println(result1);
        int[] nums2 = {0,1,2,8,17};
        int result2 = findEqualNum(nums2);
        System.out.println(result2);
	}

}
