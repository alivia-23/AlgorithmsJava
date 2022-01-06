package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
	Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	An input string is valid if:
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Example 1:
	Input: s = "()"
	Output: true
	Example 2:
	Input: s = "()[]{}"
	Output: true
	Example 3:
	Input: s = "(]"
	Output: false
	Example 4:
	Input: s = "([)]"
	Output: false
	Example 5:
	Input: s = "{[]}"
	Output: true
	 
	Constraints:
	1 <= s.length <= 104
	s consists of parentheses only '()[]{}'.
 * @author witha
 *  Time complexity - O(N) because we traverse the entire string one character at a time and stack push and pop operation involves O(1) time
 *  Space complexity - O(N) because worst we may end up having  'N' (((((( in the stack 
 */
public class ValidParenthesis {
	
	public static boolean validParenthesis(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		// add the opening brackets in the stack
		// if we get close bracket then check stack's top element matches with map's value
		// stack is LIFO so whichever would open first that should also close first then only we will find match
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				if (stack.isEmpty()) return false;
				if (stack.peek() == map.get(c)) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}

}
