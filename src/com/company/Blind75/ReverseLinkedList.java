package com.company.Blind75;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode reverseList(ListNode head) {
        List<Integer> values = new ArrayList<>();

        while (head != null) {
            values.add(head.val);
            // System.out.println(head.val);
            head = head.next;
        }

        ListNode newHead = new ListNode();

        if (values.size() > 0) {
            newHead = new ListNode(values.get(values.size() - 1));

            ListNode pointer = newHead;

            for (int i = values.size() - 2; i >= 0; i--) {
                ListNode newNode = new ListNode(values.get(i));
                pointer.next = newNode;
                pointer = newNode;
            }
        } else {
            newHead = null;
        }


        return newHead;

    }
}
