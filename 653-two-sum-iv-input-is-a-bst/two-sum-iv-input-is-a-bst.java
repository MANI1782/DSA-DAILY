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
        Map<Integer, Integer> map = new HashMap<>();
        return addElements(map, root, k);
    }
    
    boolean addElements(Map<Integer, Integer> map, TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        
        // 1. Check if the complement exists in the map
        if (map.containsKey(k - root.val)) {
            return true;
        }
        
        // 2. Add current value to the map
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        
        // 3. Recurse: if either left OR right finds it, bubble 'true' up immediately
        return addElements(map, root.left, k) || addElements(map, root.right, k);
    }
}