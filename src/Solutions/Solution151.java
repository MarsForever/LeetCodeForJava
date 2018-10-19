package Solutions;

public class Solution151 {
	public String reversWords(String s) {
		String [] word = s.split("\\s+");
		String reversWords = new String();
		if(word.length > 0 && word[0] != " ") {
			for (int i = word.length-1 ; i >= 0 ; i--) {
				reversWords += word[i] + " ";
			}
			reversWords = reversWords.trim();
		}
		return reversWords;
	}
}
