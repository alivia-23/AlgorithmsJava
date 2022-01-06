package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given a list of strings sort the strings by third character
 */

public class SortStringByKChar {

	public static void main(String[] args) {
		List<String> S = Arrays.asList("aad", "aac", "aab", "aam", "fdh");
		System.out.println(sortString(S));

	}

	public static List<String> sortString(List<String> str) {
		List<String> result = new ArrayList<>();
		Collections.sort(str, (s1, s2) -> s1.charAt(2) - s2.charAt(2));
		
		for (String s : str) {
			result.add(s);
		}
		return result;
	}

}
