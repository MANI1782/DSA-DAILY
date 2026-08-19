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
    TreeNode found=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        check(root,p,q);
        return found;

    }        
     void check(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return ;

        }
        

        if(root.val>p.val && root.val>q.val){
            check(root.left,p,q);
        }else if(root.val<p.val && root.val<q.val){
            check(root.right,p,q);
        }else{
            found=root;
        }
        return ;

    }
       

}