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
    int ans = 0;
    int count = Integer.MIN_VALUE;

    public int findBottomLeftValue(TreeNode root) {
        check(root, 0);
        return ans;

    }

    void check(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {

            if (count < depth) {
                count = depth;
                ans = root.val;
            }
        }
        check(root.left, depth + 1);
        check(root.right, depth + 1);

    }
}