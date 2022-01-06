package strings;

/*Check if a string is palindrome*/

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("abc"));
		System.out.println(isPalindrome(""));
		System.out.println(isPalindrome(null));
		System.out.println(isPalindrome("Aba"));
		System.out.println(isPalindrome("ab121ba"));

	}
	
	public static boolean isPalindrome(String str) {
		
		if (str == null) {
			return true;
		}
		
		String s = str.toLowerCase();
		
		int low = 0, high = s.length() - 1;
		
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			} 
			low++;
			high--;
		}
		return true;
	}

}
