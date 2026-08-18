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
    boolean found=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        check(root,targetSum,0);
        return found;
        
    }
    void check(TreeNode root,int target,int sum){
        if(root==null || found){
            return;
        }
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==target){
                found=true;
            }

        }
        check(root.left,target,sum);
        check(root.right,target,sum);
        
        


        

    }
}