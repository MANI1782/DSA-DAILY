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
    int sum1=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        check(root,0);
        return sum1;
        
    }
    void check(TreeNode root,int sum){
        if(root==null){
            return;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum1=sum1+root.left.val;
        }
        check(root.left,sum);
        check(root.right,sum);
        
    }
}