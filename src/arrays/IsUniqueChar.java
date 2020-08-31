package arrays;

import java.util.HashSet;
import java.util.Set;

/* Implement an algorithm to see if a string has all unique characters*/
/*Using extra space*/
/*Runtime - O(n)*/

public class IsUniqueChar {
	
	public static boolean isUniqueChar(String str) {
		Set<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (set.contains(c)) return false;
			set.add(c);
		}
		return true;
	}
	
	public static void main(String[] arg) {
		String s = "abcahek7836538i";
		String s1 = "abcdefgh";
		String s2 = "porpghio";
		String s3 = "";
		
		System.out.println(isUniqueChar(s));
		System.out.println(	isUniqueChar(s1));
		System.out.println(	isUniqueChar(s2));
		System.out.println(	isUniqueChar(s3));
	}

}
