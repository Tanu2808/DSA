public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) if (fast.next == null) slow = slow.next;
        fast = head;
        ListNode node = new ListNode(slow.val);
        slow = slow.next;
        while (slow != null) {
            ListNode temp = new ListNode(slow.val);
            temp.next = node;
            node = temp;
            slow = slow.next;
        }
        while (node != null) {
            if (fast.val != node.val) return false;
            fast = fast.next;
            node = node.next;
        }
        return true;
        
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