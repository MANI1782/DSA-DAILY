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
    TreeNode prev=null;
    boolean found=true;
    public boolean isValidBST(TreeNode root) {
      
        check(root);
        return found;
        
    }
    void check(TreeNode root){
        if(root==null){
            return;
        }
        check(root.left);
        if(prev==null){
                prev=root;
        }else{
            if(root.val<=prev.val){
                found=false;
               
            }else{
                 prev=root;
            }
        }
        check(root.right);

    

    }

}