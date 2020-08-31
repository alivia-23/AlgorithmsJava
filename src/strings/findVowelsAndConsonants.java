package strings;

public class findVowelsAndConsonants {
	
	public static void findVowelsAndConsonants(String s) {
		char[] str = s.toCharArray();
		int vowelCount = 0, consonantCount = 0;
		for (char c : str) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonantCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abiogh";
		
		findVowelsAndConsonants(a);
		

	}

}
