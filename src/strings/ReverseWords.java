package strings;

import java.util.Arrays;

public class ReverseWords {
	
	public static String reverseWords(char[] sentence) {
	    String[] str = String.valueOf(sentence).split("\\s+");
	    System.out.println(str.length);
       
	    int low = 0;
	    int high = str.length-1;

	    while (low <= high) {
	      String temp = str[high];
	      str[high] = str[low];
	      str[low] = temp;
	      low++;
	      high--;
	    }
	    System.out.println(Arrays.toString(str));
	    return Arrays.toString(str);
	}

	public static void main(String[] args) {
        char[] ch = {'w','e',' ','l','o','v','e',' ','j','a','v','a'};
        String s = reverseWords(ch);
        System.out.println(s);
        char[] ch1 = {'H','e','l','l','o',' ','W','o','r','l','d'};
        String s1 = reverseWords(ch1);
        System.out.println(s1);
	}

}
