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

    static void addFirst(int data)
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

    static void addLast(int data)
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

    static void addPos(int data, int pos)
    {
        if(pos == 0)
        {
            addFirst(data);
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

    static int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    static int removeLast()
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

    static void print()
    {
        Node temp = head;
        while(temp.next != null)
        {
            System.out.print(temp.data + "->");
        }
        System.out.print("null");
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        addFirst(1);
        addLast(3);
        addPos(2,1);
        removeFirst();
        removeLast();
        print();
        search();    
    }
}
