package HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */

public class Subsets2 {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        //sort the given input array to handle duplicate
	        Arrays.sort(nums);
	        List<List<Integer>> subsets = new ArrayList<>();
	        subsets.add(new ArrayList<>());
	        int startIndex = 0;  
	        int endIndex = 0;
	        for (int i = 0; i < nums.length; i++) {
	            startIndex = 0;           
	            if (i > 0 && nums[i] == nums[i - 1]) {
	                startIndex = endIndex + 1;
	            }
	            endIndex = subsets.size() - 1;
	            for (int j = startIndex; j <= endIndex; j++) {
	                List<Integer> set = new ArrayList<>(subsets.get(j));
	                set.add(nums[i]);
	                subsets.add(set);
	            }
	            
	        }
	        return subsets;
	    }

}
