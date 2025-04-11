package org.example;

import org.example.treehelper.TreeNode;

public class LowestCommonAncestorofaBinaryTree {
    public static void main(String[] args) {

    }


    TreeNode lowestCommonAncestorNode;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        hasChild(root,p,q) ;
        return lowestCommonAncestorNode ;

    }

    public boolean hasChild(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean left = hasChild(root.left, p, q);
        boolean right = hasChild(root.right, p, q);
        if ((left && right) || (root == p && (left || right)) || (root == q && (left || right))) {
            lowestCommonAncestorNode = root;
        }
        if (root == p || root == q) return true;
        return false;
    }

}
