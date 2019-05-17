package Solutions;

public class Solution791customSortString {
	public String customSortString(String S, String T) {
        int[] count = new int[26];
        StringBuffer s = new StringBuffer();
        for(char c : T.toCharArray()){
            count[c - 'a']++;
        }
        for(char c : S.toCharArray()){
            while(count[c - 'a'] > 0){
                s.append(c);
                count[c - 'a']--;
            }
        }
        for(char c = 'a'; c <= 'z'; c++){
            while(count[c - 'a'] > 0){
                s.append(c);
                count[c - 'a']--;
            }
        }
        return s.toString();
    }
	public static void main(String[] args) {
		String S = "cba";
		String T = "abcd";
		Solution791customSortString test = new Solution791customSortString();
		System.out.println(test.customSortString(S, T));
	}

}
