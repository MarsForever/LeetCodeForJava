package Solutions;

public class Solution557 {
	public String reverseWords(String s) {
		String[] word = s.split(" ");
		s = "";
		for(int i = 0 ; i < word.length; i++) {
			s += new  StringBuilder(word[i]).reverse().toString() + " ";
		}
		return s.trim();
	}
}
