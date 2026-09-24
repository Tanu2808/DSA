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
public class Deletion {
    public static Node deleteHead(Node head)
    {
        if (head == null) {
            return head;
        }
        Node temp = head.next;
        head.next = null;
        return temp;
    }

    public static Node deleteTail(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;

        return temp;
    }

    public static Node deletePosition(Node head, int position)
    {
        if (head == null) {
            return head;
        }
        if (position == 1)
        {
            return deleteHead(head);
        }
        int count = 0;
        Node temp = head;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) return head;
        Node temp2 = temp.next; 
        temp.next = temp2.next;
        temp2.next = null; 

        return head;
    }

    public static Node deleteValue(Node head, int value)
    {
        if (head == null)
        {
            return null;
        }
        if (head.data == value)
        {
            return deleteHead(head);
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) return head;     
        Node temp2 = temp.next; 
        temp.next = temp2.next;
        temp2.next = null; 

        return head;
    }
}
