package org.example;

import org.example.treehelper.TreeNode;

public class BinaryTreeMaximumPathSum {

    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        PathSum(root);
        return maxSum;
    }


    public int PathSum(TreeNode root) {
        if (root == null) return 0;
        int left = PathSum(root.left);
        int right = PathSum(root.right);
        maxSum = Math.max(maxSum, left + right + root.val);
        return  Math.max(root.val, root.val + Math.max(left, right));
    }
}
