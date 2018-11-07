package Solutions;

import Execute.TreeNode;

public class Solution226 {
	public TreeNode invertTree(TreeNode root) {
		TreeNode temp;
		if(root == null) {
			return null;
		}else {
			temp = invertTree(root.left);
			root.left = invertTree(root.right);
			root.right = temp;
		}
		return root;
	}

}
