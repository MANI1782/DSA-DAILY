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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            while(size>0){
                TreeNode t=q.poll();
                temp.add(t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);

                }
                size--;
                
            }
            list.add(temp);



        }
        return list;
        
    }
}