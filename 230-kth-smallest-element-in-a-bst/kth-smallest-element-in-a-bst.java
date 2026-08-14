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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        check(pq,root,k);
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.peek();
        
    }
    void check(PriorityQueue<Integer> pq,TreeNode root,int k){

        if(root==null){
            return ;
        }
        pq.add(root.val);
        check(pq,root.left,k);
        check(pq,root.right,k);
        return;
        

    }
}