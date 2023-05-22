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
         implied null* [{1}, {2}, {3}, {4}, {5}] *implied null
         [0]:
            prev: null
            val: 1
            next: 2
         [1]:
            prev: 1
            val: 2
            next: 3
         [2]:
            prev: 2
            val: 3
            next: 4
         [3]:
            prev: 3
            val: 4
            next: 5
         [4]:
            prev: 4
            val: 5
            next: null

         head = {1}

         1st iteration:
         current = 1 (not null)

         next = 2 (current.next) this stores the value for loop iterations
         current.next = null (prev)
         prev = 1 (current)
         current = 2 (next)


         current now is 2
         list:
            implied null* [{2}, {1}, {3}, {4}, {5}] *implied null

        [0]: ** THIS IS ONLY INDEX 0 IN REFERENCE TO NODE VAL 1
            prev: 1
            val: 2
            next: 3
        [1]: ** THIS WAS MODIFIED LAST ITERATION
            prev: 2
            val: 1
            next: null
        [2]:
            prev: 2
            val: 3
            next: 4
        [3]:
            prev: 3
            val: 4
            next: 5
        [4]:
            prev: 4
            val: 5
            next: null


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
