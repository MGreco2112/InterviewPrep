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
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        /*
         [1, 2, 3, 4, 5]
         head = 1

         1st iteration:
         current = 1 (not null)

         next = 2 (current.next) this stores the value for loop iterations
         current.next = null (prev)
         prev = 1 (current)
         current = 2 (next)

         list: [null, 2, 1, 3, 4, 5]
         current now is 2

         current continues down the line in original order
         */

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;

    }
}
