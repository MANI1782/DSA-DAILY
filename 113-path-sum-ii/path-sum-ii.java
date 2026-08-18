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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        check(root,0,targetSum,res,ans);
        return res;
        
    }
    void check(TreeNode root,int sum,int target,List<List<Integer>> list,List<Integer> curr){
        if(root==null) return;
        sum+=root.val;
        curr.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==target){
                list.add(new ArrayList<>(curr));
            }
        }
      
        check(root.left,sum,target,list,curr);
        check(root.right,sum,target,list,curr);
        curr.remove(curr.size()-1);
    }
}