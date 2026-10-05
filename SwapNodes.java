public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        ListNode nodeNext = head.next;
        head = nodeNext;
        ListNode previousTail = node;
        while (true) {
            //  swap 
            ListNode temp = nodeNext.next;
            nodeNext.next = node;
            node.next = temp;
            if (temp == null || temp.next == null) break;
            // next nodes
            node = temp;
            nodeNext = temp.next;

            previousTail.next = nodeNext;
            previousTail = node;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}