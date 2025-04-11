package org.example;

import org.example.treehelper.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum<0 ) return false;
        if (targetSum == 0) return true;
        return hasPathSum(root.left, targetSum - root.val)||hasPathSum(root.right, targetSum - root.val);
    }
}
