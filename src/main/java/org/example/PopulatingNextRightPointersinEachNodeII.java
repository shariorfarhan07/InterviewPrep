package org.example;

import org.example.treehelper.*;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNodeII {
    public static void main(String[] args) {


    }


    public Node connect(Node root) {
            Node curr = root;
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            int counter = 0;
            while (!q.isEmpty()) {
                Node n = q.remove();
                if (n != null) {
                    q.add(n.right);
                    q.add(n.left);
                    if (n.right != null) { q.add(n.right); counter++; }
                    if (n.left != null) { q.add(n.next); counter++; }
                }
            }


            return root;
    }
}
