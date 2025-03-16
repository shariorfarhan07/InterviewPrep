package org.example;

import org.example.treehelper.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] index = new int[6001];
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            index[inorder[i] + 3000] = i;
        }

        for (int i = 1; i < preorder.length; i++) {
            TreeNode temp = root;
            while (true) {
                if (index[preorder[i] + 3000] < index[temp.val + 3000]) {
                    if (temp.left == null) {
                        temp.left = new TreeNode(preorder[i]);
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = new TreeNode(preorder[i]);
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }

        return root;
    }


    public static TreeNode buildTree1(int[] preorder, int[] inorder) {
        Map<Integer, Integer> index = new HashMap<Integer, Integer>();
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            index.put(inorder[i], i);
        }

        for (int i = 1; i < preorder.length; i++) {
            TreeNode temp = root;
            while (true) {
                if (index.get(preorder[i]) < index.get(temp.val)) {
                    if (temp.left == null) {
                        temp.left = new TreeNode(preorder[i]);
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = new TreeNode(preorder[i]);
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
