package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> res = new ArrayList<>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for (int num : nums2) {
			if (map.containsKey(num)) {
				res.add(num);
				map.put(num, map.getOrDefault(num, 0)-1);
				if (map.get(num) == 0) {
					map.remove(num);
				}
			}
		}
		int[] result = new int[res.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = res.get(i);
		}
		return result;
	}

}
