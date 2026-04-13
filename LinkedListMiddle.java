class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LinkedListMiddle {
    public ListNode middleNode(ListNode head) {
        int totalNodes = 0;
        ListNode current = head;
        while (current != null) {
            totalNodes++;
            current = current.next;
        }

        int middleIndex = totalNodes / 2;
        current = head; 
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LinkedListMiddle solver = new LinkedListMiddle();
        System.out.println(solver.middleNode(head).val);
    }
}