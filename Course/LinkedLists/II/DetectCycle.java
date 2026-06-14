package Course.LinkedLists.II;
import Course.LinkedLists.I.LinkedList;

public class DetectCycle 
{
    public static boolean isCycle()
    {
        LinkedList.Node slow = LinkedList.head;
        LinkedList.Node fast = LinkedList.head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addPos(3, 2);
        ll.addLast(5);
        LinkedList.tail.next = LinkedList.head.next;
        System.out.println(isCycle());
    }
}
