package Day_5_LinkedList;

public class removeNthFromEnd {

    public class Listnode {
      int val;
      Listnode next;
      Listnode() {}
      Listnode(int val) { this.val = val; }
      Listnode(int val, Listnode next) { this.val = val; this.next = next; }
      }

        public Listnode removeNthFromEnd(Listnode head, int n) {
            Listnode start = new Listnode();
            start.next = head;
            Listnode fast = start;
            Listnode slow = start;

            for (int i = 1; i <= n; ++i)
                fast = fast.next;

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

            return start.next;
        }

}
