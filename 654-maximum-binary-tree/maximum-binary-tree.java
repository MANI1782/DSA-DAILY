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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return check(nums,0,nums.length-1);
        
    }
    TreeNode check(int[] nums,int low,int high){
        if(low>high) return null;
        int maxindex=max(nums,low,high);
        TreeNode root=new TreeNode(nums[maxindex]);
        root.left=check(nums,low,maxindex-1);
        root.right=check(nums,maxindex+1,high);

        return root;

        
    }

    int max(int nums[],int low,int high){
        int max1=low;
        for(int i=low;i<=high;i++){
           if(nums[max1]<nums[i]){
            max1=i;
           }

        }
        return max1;
    }
}