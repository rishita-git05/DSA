public class DoubleLL 
{
    public static class Node
    {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("DLL is empty");
            return -1;
        }
        int val = head.data;
        if(head == tail)
        {
            head = tail = null;
            return val;
        }
        
        head = head.next;
        head.prev = null;
        return val;
    }

    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) 
    {
        DoubleLL dll = new DoubleLL(); 
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
    }
}
