public class Reverse 
{
    public static void reverse()
    {
        LinkedList.Node prev = null;
        LinkedList.Node curr = LinkedList.head;
        LinkedList.Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedList.head = prev;
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addPos(3, 2);
        ll.print();
        reverse();
        ll.print();
    }
}
