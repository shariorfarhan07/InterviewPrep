package org.example;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum = 0;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (l1 != null || l2 != null || carry != 0) {
            sum = carry + ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val);
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0, sum = 0;
        ListNode sumListNode = new ListNode(0);
        ListNode head = sumListNode;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val + carry;
                l2 = l2.next;
            }
            sumListNode.next = new ListNode(sum % 10);
            sumListNode = sumListNode.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            sumListNode.next = new ListNode(carry);
        }
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }


    }
}
