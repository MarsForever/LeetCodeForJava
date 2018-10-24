package Solutions;

public class Solution557 {
	public String reverseWords(String s) {
		String[] word = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < word.length; i++) {
			sb.append(new  StringBuilder(word[i]).reverse().toString() + " ");
		}
		return sb.toString().trim();
	}
}
