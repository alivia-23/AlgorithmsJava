package miscellaneou;
/* Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 * */
public class ReverseInteger {
	public static int reverse(int x) {
		long result = 0;
		
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		return (int)result == result ? (int)result : 0;
	}
	
	public static void main(String[] args) {
		int num = 145;
		System.out.println(reverse(num));
		
	}

}
