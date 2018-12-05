package Execute;

import Solutions.Solution938;

public class rangeSumOfBst938 {
	public static void main(String arg[]) {
		TreeNode root = new TreeNode(10);
		int L = 7;
		int R = 15;
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);
		Solution938 test  = new Solution938();
		System.out.println(test.rangeSumBST(root, L, R));
	}
}


//Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//Output: 32
//Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//Output: 23