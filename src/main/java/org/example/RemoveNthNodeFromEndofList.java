package org.example;

import org.example.LinkedListHelp.ListHelper;
import org.example.LinkedListHelp.ListNode;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode n = ListHelper.createLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListHelper.print(removeNthFromEnd(n, 5));
        n = ListHelper.createLinkedList(new int[]{1});
        ListHelper.print(removeNthFromEnd(n, 1));
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        int count = 0;
        while (tail != null) {
            count++;
            tail = tail.next;
        }
        tail = head;
        if (count == n) {
            return head.next;
        }
        int i = 1;
        while (count - n != i++) {
            tail = tail.next;
        }

        tail.next = tail.next.next;

        return head;
    }

}
