package strings;

import java.util.HashMap;

/*Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.
Example 1:
Input: text = "nlaebolko"
Output: 1
Example 2:
Input: text = "loonbalxballpoon"
Output: 2

 * */

public class FindMaxNumBalloons {
	/*//Time Complexity - O(n)
      //Space Complexity - O(n)
	   
	   public int maxNumberOfBalloons(String text) {
		   HashMap<Character, Integer> map = new HashMap<>();
		   for (char c : text.toCharArray()) {
			   map.put(c, map.getOrDefault(c, 0) + 1);
		   }
		   int min = Integer.MAX_VALUE;
		   min = Math.min(min, map.getOrDefault('b', 0));
		   min = Math.min(min, map.getOrDefault('a', 0));
		   min = Math.min(min, map.getOrDefault('l', 0) / 2);
		   min = Math.min(min, map.getOrDefault('o', 0) / 2);
		   min = Math.min(min, map.getOrDefault('n', 0));
		   
		   return min;
	   }*/
   
   //without using map
	// Time Complexity - O(n)
	// Space Complexity - O(1)
   public int maxNumberOfBalloons(String text) {
	   int[] count = new int[5];
	   for (char ch : text.toCharArray()) {
		   switch(ch) {
			   case 'b' : count[0]++; break;
			   case 'a' : count[1]++; break;
			   case 'l' : count[2]++; break;
			   case 'o' : count[3]++; break;
			   case 'n' : count[4]++; break;
		   }			  
	   }
	   int min = Integer.MAX_VALUE;
	   min = Math.min(min, count[0]);
	   min = Math.min(min, count[1]);
	   min = Math.min(min, count[2] / 2);
	   min = Math.min(min, count[3] / 2);
	   min = Math.min(min, count[4]);
	   return min;
   }
  
}
