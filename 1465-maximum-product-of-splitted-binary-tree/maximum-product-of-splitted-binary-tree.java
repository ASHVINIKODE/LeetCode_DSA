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
    long totalSum = 0;
    long maxAns = 0;
    long mod = 1000000007;

    public int maxProduct(TreeNode root) {
        totalSum = treeSum(root);
        findMax(root);
        return (int) (maxAns % mod);
    }

    public long treeSum(TreeNode node) {
        if (node == null)
            return 00;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

    private long findMax(TreeNode node) {
        if (node == null)
            return 0;
        long leftSum = findMax(node.left);
        long rightSum = findMax(node.right);
        long subSum = node.val + leftSum + rightSum;
        long product = subSum * (totalSum - subSum);
        maxAns = Math.max(maxAns, product);
        return subSum;
    }
}