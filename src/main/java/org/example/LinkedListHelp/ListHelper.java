package org.example.LinkedListHelp;

public class ListHelper {
    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head);
    }

    public static ListNode createLinkedList(int[] a) {
        ListNode head = null;
        for (int i = a.length - 1; i >= 0; i--) {
            head = new ListNode(a[i], head);
        }
        return head;
    }
}
