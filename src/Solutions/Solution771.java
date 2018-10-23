package Solutions;

public class Solution771 {
	public int numJewelsInStones(String J, String S) {
		String[] jArray = J.split("");
		int total = 0;
		
		for(int i = 0; i < jArray.length ; i++) {
			total += S.length() - S.replace(jArray[i], "").length();
		}
		return total;
	}
}
