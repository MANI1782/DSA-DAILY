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
    int res=Integer.MIN_VALUE;
    int max=Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        check(root,0);
        if(max==Integer.MIN_VALUE) return 0;
        return max;
        
    }
    void check(TreeNode root,int count){
        if(root==null){
            return;
        }
        count=count+1;
        if(root.left==null && root.right==null){
            res=count;
            max=Math.max(max,res);
        }
        check(root.left,count);
        check(root.right,count);

    }
}