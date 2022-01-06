package strings;
/**
 * String to Integer(atoi)
 * Constraints:
 *  0 <= s.length <= 200
 *  s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class StringToInteger {
	
	public static int stringToInteger(String s) {
		// get rid of all the whitespaces
		s = s.trim(); 
		
		int index = 0;
		int result = 0;
		int prevRes = 0;
		int sign = 1;
		
		// Check for sign
		if (s.charAt(0) == '-' || s.charAt(0) == '+') {
			index = 1;   // increment the index
			if (s.charAt(0) == '-') sign = -1;
		}
		
		// loop through the string 
		for (int i = index; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') { // convert to integer if characters are in the range from 0-9
				prevRes = result;
				result = result * 10 + (s.charAt(i) - '0');
			} else {
				break;
			}
			// Check overflow condition if current result exceeded 2 pow 31 value
			if (prevRes != result / 10) {
				return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
		}
		return result * sign;
	}

	public static void main(String[] args) {
        String s1 = "42";  // 42
        System.out.println(stringToInteger(s1));
        
        String s2 = "   -42";  // -42
        System.out.println(stringToInteger(s2));
        
        String s3 = "4193 with words";  // 4193
        System.out.println(stringToInteger(s3));
        
        String s4 = "words and 987";  // 0
        System.out.println(stringToInteger(s4));
        
        String s5 = "-91283472332";   // -2147483648  Since -91283472332 is less than the lower bound of the range [-2^31, 2^31 - 1],
                                                  // so the final result is clamped to -2 ^ 31 = -2147483648.
        System.out.println(stringToInteger(s5));
	}

}
