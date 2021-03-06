package Solutions;

import java.util.HashMap;

public class Solution387FirstUniqueCharacterInAString{
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
    public static void main(String [] args){
        String s = "aadadaad";
        Solution387FirstUniqueCharacterInAString test = new Solution387FirstUniqueCharacterInAString();
        System.out.println(test.firstUniqChar(s));

    }
}
//Your runtime beats 34.47 % of java submissions.
//Your memory usage beats 99.47 % of java submissions.