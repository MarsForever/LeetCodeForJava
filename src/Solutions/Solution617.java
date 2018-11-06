package Solutions;

import Execute.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

public class Solution617 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null)
			return null;
		else if (t1 == null)
			return t2;
		else if (t2 == null)
			return t1;
		else {
			t1.val += t2.val;
			t1.left = mergeTrees(t1.left, t2.left);
			t1.right = mergeTrees(t1.right, t2.right);
			return t1;
		}
	}
}
