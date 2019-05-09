package Solutions;

public class Solution344_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution344_2 test = new Solution344_2();
		String s = "Hello";
		System.out.println(test.reverseString(s));
	}
	public static String reverseString(String s) {
		int length = s.length();
	    if (length <= 1) {
	         return s;
	     }
	    String leftStr = s.substring(0, length / 2);
	    String rightStr = s.substring(length / 2, length);
        return reverseString(rightStr) + reverseString(leftStr);
    }
}
