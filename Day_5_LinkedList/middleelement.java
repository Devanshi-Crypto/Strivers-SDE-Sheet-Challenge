package Day_5_LinkedList;

import Day_5_LinkedList.reverseLinkedList.ListNode;

public class middleelement {

     int val;
     ListNode next;
     void ListNode() {}
     void ListNode(int val) { this.val = val; }
     void ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
