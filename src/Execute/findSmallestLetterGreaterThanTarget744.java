package Execute;

import Solutions.Solution744;

public class findSmallestLetterGreaterThanTarget744 {
	public static void main(String[] args) {
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		
		Solution744 test = new Solution744();
		System.out.println(test.nextGreatestLetter(letters, target));
	}
}
