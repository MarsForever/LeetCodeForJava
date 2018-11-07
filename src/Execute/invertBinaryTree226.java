package Execute;

import Solutions.Solution226;

public class invertBinaryTree226 {

	public static void main(String args[]) {
		TreeNode root1 = new TreeNode(4);
		root1.left =new TreeNode(2);
		root1.right = new TreeNode(7);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);
		root1.right.left = new TreeNode(6);
		root1.left.right = new TreeNode(9);
		Solution226 test = new Solution226();
		System.out.println("Result: " + test.invertTree(root1));
	}
}
