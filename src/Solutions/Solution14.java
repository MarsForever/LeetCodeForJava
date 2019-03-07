package Solutions;

public class Solution14 {
	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;
//	    https://leetcode.com/problems/longest-common-prefix/solution/
//	    Approach 1: Horizontal scanning
//	    Runtime: 7 ms, faster than 59.30% of Java online submissions for Longest Common Prefix.

    }
}
