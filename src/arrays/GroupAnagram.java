package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.

 Time complexity - O(NKlogK) - N is the number of string in the string array and K is length of the individual string and since we sort each string 
                                   so total time complexity is O(nklogk)
 Space complexity - O(NK) - We are keeping n list of anagrams and each list contain k strings in it
 * */

public class GroupAnagram {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		if (strs.length == 0) {
			return result;
		}
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] chs = s.toCharArray();
			Arrays.sort(chs);
			String key = new String(chs); // convert the sorted character in a string
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			List<String> value = map.get(key);
			value.add(s);
		}
		
		//loop through the map keys and add each bucket in the result list
		for (String key : map.keySet()) {
			List<String> value = map.get(key); // get each bucket from the map
			result.add(value);  // add the bucket in the result
		}
		return result;
	}

}

// toString() vs new String()
