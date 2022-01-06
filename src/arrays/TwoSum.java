package arrays;

import java.util.HashMap;

/* Given an array of integers nums and and integer target, return the indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
 * */

public class TwoSum {
	
	//TwoSum with Brute force
	public int[] twoSumBrute(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}
	
	// TwoSum with optimised approach Time Complexity - O(n) where each look up in the table costs O(1). Space Complexity - O(n)
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int subtract = target - nums[i];
			if (map.containsKey(subtract)) {
				return new int[] {i, map.get(subtract)};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	

}
