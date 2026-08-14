/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        check(root,p,q);
        return ans;
        
    }
    int check(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return 0;
        }
        int sum=0;
        int left=check(root.left,p,q);
        int right=check(root.right,p,q);
        if(root==p || root==q){
            sum=1;
        }
        int total=left+right+sum;
        if(total==2 && ans==null){
            ans=root;
        }
        return total;
    }
}