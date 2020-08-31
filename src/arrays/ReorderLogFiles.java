package arrays;

/* You have an array of logs.  Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.  Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.

Return the final order of the logs.

 

Example 1:

Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 * */

import java.util.Arrays;
import java.util.Comparator;

public class ReorderLogFiles {
	
	public String[]  reorderLogFiles(String[] logs) {
		Arrays.sort(logs, new LogComparator());
		return logs;
	}

}

class LogComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// since we split the strings so we keep it in an array
		String[] string1 = s1.split("\\s+", 2);
		String[] string2 = s2.split("\\s+", 2);
		
		//we check for both strings if index 1 first character is digit or not
		boolean isDigitString1 = Character.isDigit(string1[1].charAt(0));
		boolean isDigitString2 = Character.isDigit(string2[1].charAt(0));
		
		// if both the strings first character is digit we return 0 that is remains same order
		if (isDigitString1 && isDigitString2) {
			return 0;
		} else if (!isDigitString1 && isDigitString2 ) { //if first string is letter and second is digit then we return -1 to put letter first
			return -1;
		} else if (isDigitString1 && !isDigitString2) { //if first string is digit and second is letter then we return 1 to put second string first
			return 1;
		} else {     // if string1 first character is same as string2 first character then we compare for the 0th index identifier
		    int cmp = string1[1].compareTo(string2[1]);
		    if (cmp != 0) {
		    	return cmp;
		    } else {
		    	return string1[0].compareTo(string2[0]);
		    }
		}
	}
	
}
