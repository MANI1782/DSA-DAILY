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
    int min=Integer.MAX_VALUE;
    int res=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        check(root,1);
        if(res==Integer.MAX_VALUE) return 0;
        return res;
        
    }
    void check(TreeNode root,int count){
        if(root==null){
            return ;
        }
        
        if(root.left==null && root.right==null){
            min=count;
            res=Math.min(res,min);
        }
        count=count+1;
        check(root.left,count);
    
        check(root.right,count);
        
    }
}