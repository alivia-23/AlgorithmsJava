/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

	We define the usage of capitals in a word to be right when one of the following cases holds:
	
	All letters in this word are capitals, like "USA".
	All letters in this word are not capitals, like "leetcode".
	Only the first letter in this word is capital, like "Google".
	Otherwise, we define that this word doesn't use capitals in a right way.
	 
	
	Example 1:
	
	Input: "USA"
	Output: True
	 
	
	Example 2:
	
	Input: "FlaG"
	Output: False
 */
public class DetectCapital {
	public boolean detectCapital(String word) {
		
		int capitalCount = 0;
		boolean firstAlphabetCapital = false;
		
		//check for capitals
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				capitalCount++;
				if (i == 0) {
					firstAlphabetCapital = true;
				}
			}
		}
		
		return capitalCount == word.length() ||
				capitalCount == 0 ||
				capitalCount == 1 && firstAlphabetCapital;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
