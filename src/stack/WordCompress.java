package stack;

import java.util.Stack;

public class WordCompress {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String word = "abbcccb";
        int k = 3;
        System.out.println(compressWord(word, k));
	}
	
	 public static String compressWord(String word, int k) {
	        
	       Stack<Element> stack = new Stack<>();
	       for(int i = 0; i < word.length(); i++) {
	           char ch = word.charAt(i);
	           if(!stack.isEmpty() && ch == stack.peek().ch) {
	               Element last = stack.peek();
	               if(last.count == k - 1) {
	                   for(int j = 0; j < k - 1; j++) {
	                       stack.pop();
	                   }
	               } else {
	                   stack.push(new Element(ch,last.count + 1));
	               }
	           } else {
	               stack.push(new Element(ch, 1));
	           }
	       }
	       
	       StringBuilder sb = new StringBuilder();
	       while(!stack.isEmpty()) {
	           sb.append(stack.pop().ch);
	       }
	       
	       return sb.reverse().toString();

	 }

}


class Element {
    char ch;
    int count;
    public Element(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}
