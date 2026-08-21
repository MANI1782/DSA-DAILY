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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);

        }
        return check(inorder,postorder,map,0,inorder.length-1);
        
    }
TreeNode check(int[] inorder,int[] postorder,Map<Integer,Integer> map,int start,int end){
        if(start>end){
            return null;
        }
        int postIndex=postorder[idx--];
        TreeNode root=new TreeNode(postIndex);
        int inorderIndex=map.get(postIndex);
        root.right=check(inorder,postorder,map,inorderIndex+1,end);
        root.left=check(inorder,postorder,map,start,inorderIndex-1);
        

        return root;
}
}