public class ReverseList {
    public static Node reverse(Node head)
    {
        Node node = new Node(head.data);
        head = head.next;
        while (head != null) {
            Node temp = new Node(head.data);
            temp.next = node;
            node = temp;
            head = head.next;
        }
        head = node;
        return head;
    }

    public static Node reverseOptimized(Node head)
    {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        return prev;
    }
}

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;

    }

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;

    }
} 