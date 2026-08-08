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
        boolean leftToRight=true;
        if (root == null) return list;
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            while(size>0){
                TreeNode t=q.poll();
                temp.add(t.val);

                if(t.left!=null){
                    q.offer(t.left);

                }if(t.right!=null){
                    q.offer(t.right);
                }
                size--;
            }
            if(!leftToRight) {
                Collections.reverse(temp);
                leftToRight=true;

            }else{
                leftToRight=false;
            }
                
            list.add(temp);
                
            
            
        }
        return list; 
    }
}