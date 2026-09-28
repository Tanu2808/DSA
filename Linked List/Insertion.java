public class Insertion {
    public static Node insertHead(Node head, int data)
    {
        Node node = new Node(data, head);
        return node;
    }
    public static Node insertTail(Node head, int data)
    {
        if (head == null) return new Node(data);
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(data);
        return head;
    }
    public static Node insertPosition(Node head, int data, int position)
    {
        if (position == 1) return insertHead(head, data);
        if (head == null) return head;
        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) temp = temp.next;
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
        return head;
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