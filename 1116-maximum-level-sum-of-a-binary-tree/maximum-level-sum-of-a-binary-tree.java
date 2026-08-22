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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        int max=Integer.MIN_VALUE;
        int level1=0;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            level++;
            while(size>0){
                TreeNode t=q.poll();
                sum=sum+t.val;
                if(t.left!=null){
                    q.offer(t.left);
                }if(t.right!=null){
                    q.offer(t.right);
                }
                size--;
            }
            
            if(max<sum){
                max=sum;
                level1=level;
                
            }
        }
        return level1;
    }
}