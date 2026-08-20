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
   
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        boolean seen=false;
        if(root==null){
            return true;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            TreeNode t=q.poll();
            if(t==null){
                seen=true;
            }else{
                q.offer(t.left);
                q.offer(t.right);
                if(seen){
                    return false;

                }
                
            }

            
            
          
        }
        return true;
        
    }
    
    
}