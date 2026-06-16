public class Reverse 
{
    static void reverse()
    {
        DoubleLL.Node prev = null;
        DoubleLL.Node curr = DoubleLL.head;
        DoubleLL.Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        DoubleLL.head = prev;
    }
    public static void main(String[] args)
    {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.print();
        reverse();
        dll.print();
    }
}
