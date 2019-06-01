package Solutions;

public class Solution387FirstUniqueCharacterInAString_3 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 = "aacecaaa";
        Solution387FirstUniqueCharacterInAString_2 test = new Solution387FirstUniqueCharacterInAString_2();
        System.out.println(test.firstUniqChar(str1));
    }

}

//    Your runtime beats 91.75 % of java submissions.
//    Your memory usage beats 99.96 % of java submissions.

