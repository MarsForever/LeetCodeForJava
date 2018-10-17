package Execute;
import Solutions.Solution807;

public class maxIncreaseKeepingSkyline807 {
	public static void main(String[] args) {
		int[][] grid = 
				{{3,0,8,4},
				{2,4,5,7},
				{9,2,6,3},
				{0,3,1,0}};
		Solution807 importNum = new Solution807();
		int num = importNum.maxIncreaseKeepingSkyline(grid);
		System.out.print(num);
	}
}
