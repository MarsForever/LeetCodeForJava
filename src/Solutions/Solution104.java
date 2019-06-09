package Solutions;

import Execute.TreeNode;

public class Solution104 {
    public int getMaxDepth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = getMaxDepth(root.left);
        int rightDepth = getMaxDepth(root.right);
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }

    public static void main(String[] args){
        TreeNode data = new TreeNode(3);
        data.left = new TreeNode(9);
        data.right = new TreeNode(20);
        data.right.left = new TreeNode(15);
        data.right.right = new TreeNode(7);
        Solution104 test = new Solution104();
        System.out.println(test.getMaxDepth(data));
    }
}
