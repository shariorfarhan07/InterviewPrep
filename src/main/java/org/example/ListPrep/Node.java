package org.example.ListPrep;

import org.example.LinkedListHelp.ListNode;

public class Node {
    public Object val;
    public Node next;

    public Node() {
    }

    public Node(Object val) {
        this.val = val;
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }
}
