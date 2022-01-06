package strings;

/**
 * Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's 
 * in these substrings are grouped consecutively.
   Substrings that occur multiple times are counted the number of times they occur.
   
    Input: s = "00110011"
	Output: 6
	Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01"
	
	Input: s = "10101"
    Output: 4
	Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 * @author witha
 * 
 *  In this approach we will remember only prev and cur. Then, the result is the sum of min(prev, cur) over each different final (prev, cur) we see.
 *  Time Complexity - O(N)
 *  Space Complexity = O(1)
 *
 */

public class CountBinarySubstring {
	
	public static int countBinarySubstring(String s) {
		int prev = 0;
		int cur = 1;
		int result = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i-1)) {
				cur++;
			} else {
				result += Math.min(cur, prev);
				prev = cur;
				cur = 1;
			}
		}
		return result + Math.min(cur, prev);
	}

	public static void main(String[] args) {
		String s = "00110011";
		int result = CountBinarySubstring.countBinarySubstring(s);
		System.out.println(result);
        
		String s1 = "10101";
		int result1 = CountBinarySubstring.countBinarySubstring(s1);
		System.out.println(result1);
	}

}
