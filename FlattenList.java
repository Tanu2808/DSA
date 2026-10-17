public class FlattenList {
    public Node flatten(Node head) {
        if (head == null)
            return head;
        // iterator
        Node curr = head;
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node nextNode = curr.next;
                Node childHead = flatten(curr.child);
                curr.next = childHead;
                childHead.prev = curr;
                curr.child = null;
                
                Node tail = childHead;
                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = tail;
                }
            }
        }
        return head;

    }

}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}