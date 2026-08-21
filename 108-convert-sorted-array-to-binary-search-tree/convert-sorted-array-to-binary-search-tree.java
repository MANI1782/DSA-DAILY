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
    int index=0;
    public TreeNode sortedArrayToBST(int[] nums) {
        return check(0,nums.length-1,nums);
        
    }
    TreeNode check(int start,int end,int nums[]){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=check(start,mid-1,nums);
        root.right=check(mid+1,end,nums);

        return root;

    }
    
}