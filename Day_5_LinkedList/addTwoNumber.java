package Day_5_LinkedList;

import Day_5_LinkedList.reverseLinkedList.ListNode;

public class addTwoNumber {

     public class Listnode {
      int val;
      Listnode next;
      Listnode() {}
      Listnode(int val) { this.val = val; }
      Listnode(int val, Listnode next) { this.val = val; this.next = next; }
      }
        
    public Listnode addTwoNumbers(Listnode l1, Listnode l2) {
        Listnode dummy = new Listnode();
        Listnode temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            Listnode node = new Listnode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;

    }
}