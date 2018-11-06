package Solutions;

import Execute.TreeNode;

public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // root1 equals null
        //if root2 equals null return true
        //if root2 doesn't equals null return false
        if(root1 == null){
            return root2 == null ? true : false;
        }
        //calculate root1 and root2's leaves value
        String leaves1 = getLeaves(root1, "");
        String leaves2 = getLeaves(root2, "");
        // if root1 equals roots's leaves value return true
        // if not return false
        return leaves1.equals(leaves2) ? true : false;
    }

    private String getLeaves(TreeNode root, String leaves){
        //if leaves left and right's value equals to null return root.val
        if(root.left == null && root.right == null){
            return "" + root.val;
        }
        
        if(root.left  != null) leaves += getLeaves(root.left,  "");
        
        if(root.right != null) leaves += getLeaves(root.right, "");
        
        return leaves;
    }
}
