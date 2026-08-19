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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        check(list,root,sb);
        return list;
        
    }
    void check(List<String> list,TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        int len = sb.length();
        if(len>0) sb.append("->");
        sb.append(root.val);

        if(root.left==null && root.right==null){
            list.add(sb.toString());
        }
        
        check(list,root.left,sb);
        check(list,root.right,sb);
        sb.setLength(len);
    }
}