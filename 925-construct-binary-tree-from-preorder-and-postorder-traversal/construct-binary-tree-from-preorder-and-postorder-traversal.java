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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return check(preorder,postorder,map,0,postorder.length-1);
        
    }
    TreeNode check(int[] preorder,int[] postorder,Map<Integer,Integer> map,int start,int end){
        if(start>end) return null;
        

        TreeNode root=new TreeNode(preorder[index++]);
        if (start == end) {
            return root;
        }
        int preindex=preorder[index];
        int postindex=map.get(preindex);

        root.left=check(preorder,postorder,map,start,postindex);
        root.right=check(preorder,postorder,map,postindex+1,end-1);

        return root;




        

    }
}