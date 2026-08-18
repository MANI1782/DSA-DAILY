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
            List<Integer> list=new ArrayList<>();
            check(list,root,k);
            return list.get(k-1);
            
        }
        void check(List<Integer> list,TreeNode root,int k){

            if(root==null){
                return ;
            }
            check(list,root.left,k);
            list.add(root.val);
            check(list,root.right,k);
            return;
            

        }
    }