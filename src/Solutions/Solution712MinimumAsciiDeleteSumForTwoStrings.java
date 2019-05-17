package Solutions;

public class Solution712MinimumAsciiDeleteSumForTwoStrings {
	 public int minimumDeleteSum(String s1, String s2) {
	        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
	        //列出s1的i的ascii总值（最后一位到目前的i）
	        for (int i = s1.length() - 1; i >= 0; i--) {
	            dp[i][s2.length()] = dp[i+1][s2.length()] + s1.codePointAt(i);
	        }
	        //列出s2的j的ascii总值（最后一位到目前的j）
	        for (int j = s2.length() - 1; j >= 0; j--) {
	            dp[s1.length()][j] = dp[s1.length()][j+1] + s2.codePointAt(j);
	        }
	        for (int i = s1.length() - 1; i >= 0; i--) {
	            for (int j = s2.length() - 1; j >= 0; j--) {
	            		//对比s1，s2两个值是否相等
	                if (s1.charAt(i) == s2.charAt(j)) {
	                    dp[i][j] = dp[i+1][j+1];
	                } else {
	                    dp[i][j] = Math.min(dp[i+1][j] + s1.codePointAt(i),
	                                        dp[i][j+1] + s2.codePointAt(j));
	                }
	            }
	        }
	        return dp[0][0];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution712MinimumAsciiDeleteSumForTwoStrings test = new Solution712MinimumAsciiDeleteSumForTwoStrings();
//		s1 = "sea", s2 = "eat"
//		s1 = "delete", s2 = "leet"
		String s1 = "delete"; 
		String s2 = "leet";
		System.out.println(test.minimumDeleteSum(s1, s2));
	}

}
