package Solutions;

import Execute.TreeNode;

public class Solution965UnivaluedBinaryTree {
	public boolean isUnivalTree(TreeNode root) {
		//遍历二叉树左边的node，  左边为null或者root和左边的node相等并且左边全部返回true（左边为null或者和root相等为终结条件）
        boolean left_true = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));
        //遍历二叉树右边边的node，右边为null或者root和右边的node相等并且右边边全部返回true（右边为null或者和root相等为终结条件）
        boolean right_true = (root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));
        return left_true && right_true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution965UnivaluedBinaryTree test = new Solution965UnivaluedBinaryTree();
		TreeNode data1 = new TreeNode(1);
		data1.left = new TreeNode(1);
		data1.left.left = new TreeNode(1);
		data1.left.right = new TreeNode(1);
		data1.right = new TreeNode(1);
		data1.right.right = new TreeNode(1);
		
		TreeNode data2 = new TreeNode(2);
		data2.left = new TreeNode(2);
		data2.left.left = new TreeNode(5);
		data2.left.right = new TreeNode(2);
		data2.right = new TreeNode(2);
		System.out.println(test.isUnivalTree(data2));
	}

}
