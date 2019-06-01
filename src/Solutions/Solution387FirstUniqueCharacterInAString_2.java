package Solutions;

public class Solution387FirstUniqueCharacterInAString_2 {
    public int firstUniqChar(String s) {
        for(int i = 0; i<s.length(); i++) {
            if(s.lastIndexOf(s.charAt(i))==s.indexOf(s.charAt(i))) return i;
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
//Your runtime beats 55.03 % of java submissions.
//Your memory usage beats 98.27 % of java submissions.