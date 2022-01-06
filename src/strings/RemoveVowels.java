package strings;

import java.util.HashSet;
import java.util.Set;

/* Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
Example 1:
Input: "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"

Example 2:
Input: "aeiou"
Output: ""

Time Complexity - O(n)
Space Complexity - O(n)
 * */

public class RemoveVowels {

	public static void main(String[] args) {
		String s = "ghijklw";
		System.out.println(removeVowels(s));

	}
	
	public static String removeVowels(String S) {
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
        StringBuilder sb = new StringBuilder(); // extra space in worst case store all the elements i.e. O(n)
        for (char c : S.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
            }
        }
        return String.valueOf(sb.toString());
    }

}
