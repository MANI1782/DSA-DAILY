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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    
    check(cloned,target);
    return ans;
        
        
    }
    void check(TreeNode r1,TreeNode target){
        if(r1==null){
            return;
        }
        if(r1.val==target.val){
            ans=r1;
            return;
        }
        check(r1.left,target);
        check(r1.right,target);

    }
}