/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return check(root1,root2);
        
    }
    TreeNode check(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return null;
        }
        if(r1==null && r2!=null) return r2;
        if(r1!=null && r2==null) return r1;

        TreeNode root=new TreeNode(r1.val+r2.val);
        root.left=check(r1.left,r2.left);
        root.right=check(r1.right,r2.right);

        return root;

    }
}