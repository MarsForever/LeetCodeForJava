package Execute;

import Solutions.Solution54;

public class spiralMatrix54 {
	public static void main(String args[]) {
		int[][] matrix ={{1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
		int[][] matrix2 ={{1, 2, 3, 4 },{ 5, 6, 7, 8},{ 9,10,11,12}};
		Solution54 test = new Solution54();
		System.out.println(test.spiralOrder(matrix));
		System.out.println(test.spiralOrder(matrix2));
	}
}
