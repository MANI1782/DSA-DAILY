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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        } 
        return check(preorder,inorder,map,0,inorder.length-1);
        
    }
    TreeNode check(int[] preorder,int[] inorder,Map<Integer,Integer> map,int low,int high){
        if(low>high){
            return null;
        }
        int preindex=preorder[index++];
        TreeNode root=new TreeNode(preindex);
        int inorderIndex=map.get(preindex);
        root.left=check(preorder,inorder,map,low,inorderIndex-1);
        root.right=check(preorder,inorder,map,inorderIndex+1,high);

        return root;

    }

}