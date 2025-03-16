package org.example;

import org.example.treehelper.TreeNode;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public static void main(String[] args) {


    }


    public static TreeNode buildTree(int[] postorder, int[] inorder) {
        int[] index = new int[6001];
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        for (int i = 0; i < inorder.length; i++) {
            index[inorder[i] + 3000] = i;
        }

        for (int i = postorder.length - 2; i >= 0; i--) {
            TreeNode temp = root;
            while (true) {
                if (index[postorder[i] + 3000] < index[temp.val + 3000]) {
                    if (temp.left == null) {
                        temp.left = new TreeNode(postorder[i]);
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = new TreeNode(postorder[i]);
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }

        return root;
    }
}
