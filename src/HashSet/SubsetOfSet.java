package HashSet;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
public class SubsetOfSet {
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		// empty array added to subset
		subsets.add(new ArrayList<>());
		//iterate through all the numbers in nums array and add the numbers by making a copy of all the subsets
		for (int currentNum : nums) {
			int n = subsets.size();
		//create a new subset for the existing subset by copying the existing element
			for (int i = 0; i < n; i++) {
				List<Integer> set = new ArrayList<>(subsets.get(i));
				set.add(currentNum);
				subsets.add(set);
			}
		}
		return subsets;
	}

}
