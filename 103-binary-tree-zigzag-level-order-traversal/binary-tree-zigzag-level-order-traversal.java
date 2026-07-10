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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

         List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if (root == null) return list;
        q.offer(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> temp=new ArrayList<>();
            while(levelsize>0){
                TreeNode t=q.poll();
                
                temp.add(t.val);
                
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
                
                levelsize--; 
                
            }
            if(!leftToRight) Collections.reverse(temp);
            list.add(temp);
            leftToRight=!leftToRight;

        }
        
        return list;
        
    }
}