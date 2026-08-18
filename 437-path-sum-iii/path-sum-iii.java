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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
       
        Map<Long,Integer> map=new HashMap<>();
        map.put(0L,1);
        check(root,0L,targetSum,map);
        return count;
        
    }
    void check(TreeNode root,long sum,int target,Map<Long,Integer> map){
        if(root==null){
            return;
        }
         
        
        sum+=root.val;
        long ans=(long)sum-target;
        if(map.containsKey(ans)){
            count=count+map.get(ans);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        check(root.left,sum,target,map);
        check(root.right,sum,target,map);
        map.put(sum,map.get(sum)-1);

        
    }
}