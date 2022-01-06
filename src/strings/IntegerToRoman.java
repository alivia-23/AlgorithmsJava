package strings;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II.
	The number 27 is written as XXVII, which is XX + V + II.
	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
	Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
    
    The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	Given an integer, convert it to a roman numeral.
	Example 1:
	Input: num = 3
	Output: "III"
	Example 2:
	Input: num = 4
	Output: "IV"
	Example 3:
	Input: num = 9
	Output: "IX"
	Example 4:
	Input: num = 58
	Output: "LVIII"
	Explanation: L = 50, V = 5, III = 3.
	Example 5:
	Input: num = 1994
	Output: "MCMXCIV"
	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	Constraints:
	1 <= num <= 3999
 * @author witha
 * 
 * Key point : Romans are written as largest to smallest
 * Time Complexity - O(1) As there is a finite set of roman numerals there is a hard upper limit on how many times the loop can iterate. 
 *                        Therefore the time complexity is constant
 * Space Complexity - O(1)
 */

public class IntegerToRoman {
	
	//13 unique symbols 
	private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] symbols = 
    {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
    public String intToRoman(int num) {
		if (num == 0) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		// Loop through the values array,compare and perform calculation with the given number 
		for (int i = 0; i < values.length && num > 0; i++) {
            //Repeat while the current value is less than num and add the corresponding symbol
			while (values[i] <= num) { 
				num -= values[i];
				sb.append(symbols[i]);
			}
		}
		return sb.toString(); 
    }

}
