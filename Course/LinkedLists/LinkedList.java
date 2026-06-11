public class LinkedList 
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    static int size = 0;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addPos(int data, int pos)
    {
        if(pos < 0 || pos > size)
        {
            System.out.println("Invalid position.");
            return;
        }
        if(pos == 0)
        {
            addFirst(data);
            return;
        }
        if(pos == size)
        {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        int i = 0;
        while(i < pos - 1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0; i < size - 2; i++)
        {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
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
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(3);
        ll.print();
        ll.addPos(2, 1);
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();  
    }
}
