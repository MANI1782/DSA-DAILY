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
    public TreeNode invertTree(TreeNode root) {
        rev(root);
        return root;

       

        
        
    }
    void rev(TreeNode root){
         if(root==null){
            return ;
        }
    TreeNode temp = root.left;   // 1. Hold onto the left child safely
    root.left = root.right;         // 2. Move the right child over to the left
    root.right = temp; 
    rev(root.left);
    rev(root.right);
    return;

    }
}