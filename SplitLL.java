public class SplitLL {
    public ListNode[] splitListToParts(ListNode head, int k) {
        if (head == null) return new ListNode[k];
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int lengths = count / k;
        int extra = count % k;
        ListNode[] list = new ListNode[k];
        temp = head;
        for (int i = 0; i < list.length; i++) {
            list[i] = temp;
            int length = (extra > 0) ? lengths + 1 : lengths;
            extra--;
            for (int j = 1; j < length; j++) temp = temp.next;
            if (temp != null)
            {
                ListNode temp2 = temp.next;
                temp.next = null;
                temp = temp2;
            }
        }
        return list;

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}