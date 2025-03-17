package org.example;

import org.example.treehelper.TreeNode;

public class FlattenBinaryTreetoLinkedList {
    public static void main(String[] args) {
        System.out.println();
    }

    public static void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root;
        while (temp != null) {
            if (temp.left != null) {
                TreeNode tempLeftBottom = bottomRight(temp.left);
                tempLeftBottom.right = temp.right;
                temp.right = temp.left;
                temp.left = null;
            }
            temp = temp.right;
        }

    }
    public static TreeNode bottomRight(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
}
