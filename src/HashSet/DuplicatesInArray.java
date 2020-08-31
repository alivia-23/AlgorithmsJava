package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
	
	public static List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> result = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		for (int num : nums) {
			if (set.contains(num)) {
				result.add(num);
			}
			set.add(num);
		}
		return result;
	}
	
	public static void main(String arg[]) {
		int[] nums = {4,3,2,7,8,2,3,1};
		
		System.out.println(findDuplicates(nums));
		
	}

}
