package Execute;
import Solutions.Solution654_2;

public class MaximumBinaryTree654 {
	public static void main(String[] args) {
		int[] moves = {3,2,1,6,0,5};
		Solution654_2 a = new Solution654_2();
//		Solution654 a = new Solution654();
		System.out.println(a.constructMaximumBinaryTree(moves));
	}
}
