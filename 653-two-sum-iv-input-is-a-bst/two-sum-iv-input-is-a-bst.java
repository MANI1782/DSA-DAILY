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
    boolean found=false;
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        addElements(map,root,k);
        return found;

        
    }
    void addElements(Map<Integer,Integer> map,TreeNode root,int k){
       if(root==null ){
        return;
       }
       
      
       if(map.containsKey(k-root.val)){
            found=true;
            return;
       }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
       if(!found){
        addElements(map,root.left,k)  ;
       }
       addElements(map,root.right,k) ;

    }
}