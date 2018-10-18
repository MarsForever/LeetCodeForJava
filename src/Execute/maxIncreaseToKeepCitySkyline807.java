package Execute;

public class maxIncreaseToKeepCitySkyline807 {
	public static void main(String[] args) {
		int [][] grid = { {3, 0, 8, 4},
						  {2, 4, 5, 7},
						  {9, 2, 6, 3},
						  {0, 3, 1, 0} };
		Solutions.Solution807_2 test = new Solutions.Solution807_2();
		System.out.println(test.maxIncreaseKeepingSkyline(grid));
	}
}
