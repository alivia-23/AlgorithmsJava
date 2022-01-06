package strings;

import java.util.HashSet;
import java.util.Set;

/* Example 1 : alivia -> false
 * Example 2 : string -> true
 * */
public class CheckStringAllUniqChar {

	public static void main(String[] args) {
		String str = "string";
		String str1 = "alivia";
		System.out.println(isAllUniqChar(str));
		System.out.println(isAllUniqChar(str1));
	}
	
	public static boolean isAllUniqChar(String str) {
		Set<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (set.contains(c)) {
				return false;
			} else {
				set.add(c);
			}
		}
		return true;
	}

}
