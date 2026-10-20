public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {

        if (head == null) return null;
        ListNode dummy = new ListNode(0, head);  
        ListNode temp = head.next;
        ListNode prev = head;
        while (temp != null) {
            if (temp.val < prev.val)
            {
                ListNode node = dummy;
                while (node.next != temp && node.next.val < temp.val) node = node.next;
                
                prev.next = temp.next;
                temp.next = node.next;
                node.next = temp;
                temp = prev.next;
            }
            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}