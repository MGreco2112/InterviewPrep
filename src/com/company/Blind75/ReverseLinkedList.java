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

        /*
         implied null* [{1}, {2}, {3}, {4}, {5}] *implied null
                         _
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
                            _

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

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next; //maintain current traversal down the array
            current.next = prev; //set current.next to prior node in the chain for reversal
            prev = current; //reassign previous node to current node for next iteration
            current = next; //update current with the stored value to continue down the chain
        }

        head = prev; //back head up to previous after assigning it null to signify the end of the list
        return head;

    }
}
