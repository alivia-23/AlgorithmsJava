package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* Length between 10-15
 * Character should include $ and @
 * It should not contain #
 * */

public class ValidatePassword {

	public static void main(String[] args) {

		System.out.println(isValidPassword("$12"));
	
	}
	

	
	public static boolean isValidPassword(String password) {
		Set<Character> include = new HashSet<>(Arrays.asList('$', '@'));
		Set<Character> exclude = new HashSet<>(Arrays.asList('#'));
		
		Set<Character> seen = new HashSet<>();
		
		/*if (password.length() < 10 || password.length() > 15) {
			return false;
		}*/
		
	    for (char ch : password.toCharArray()) {
	    	if (exclude.contains(ch)) {
	    		return false;
	    	}
	    	if (include.contains(ch)) {
	    		seen.add(ch);
	    	}

	    }
		
	    return seen.size() == include.size();
		
	}

}
