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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>(); // 1 2 3 4 5 6 7
        addElements(list,root);
        Collections.sort(list);
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int sum=list.get(i)+list.get(j);
            if(k==sum){
                return true;
            }else if(sum<k){
                i++;
            }else{
                j--;
            }
        }
        return false;

        
    }
    void addElements(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        addElements(list,root.left);
        addElements(list,root.right);
        return;

    }
}