package strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("abcd"));

	}
	
	public static String reverseString(String s) {
		
		char[] chs = s.toCharArray();
		
		int low = 0, high = chs.length - 1;
		
		while (low < high) {
			swap(chs, low, high);
			low++;
			high--;
		}
		
		return String.valueOf(chs);
		
	}
	
	static void swap(char[] ch, int low, int high) {
		char temp = ch[low];
		ch[low] = ch[high];
		ch[high] = temp;
	}

}
