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

    public static void traversal(Node head)
    {
        Node temp = head;
        int length = 0; 
        while (temp != null) {
            System.out.println(temp.data);
            length++;
            temp = temp.next;
        }
        System.out.println(length);
    }

    public static boolean search(Node head, int search)
    {
        Node temp = head; 
        while (temp != null) {
            if (temp.data == search) return true;
            temp = temp.next;
        }
        return false;

    }

}