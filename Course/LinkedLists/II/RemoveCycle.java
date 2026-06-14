package Course.LinkedLists.II;
import Course.LinkedLists.I.LinkedList;

public class RemoveCycle 
{
    public static void removeCycle()
    {
        boolean cycle = false;

        LinkedList.Node slow = LinkedList.head;
        LinkedList.Node fast = LinkedList.head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }
        
        if(!cycle)
            return;

        slow = LinkedList.head;

        LinkedList.Node prev = null;

        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
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
        System.out.println(DetectCycle.isCycle());
        removeCycle();
        System.out.println(DetectCycle.isCycle()); 
        ll.print();   
    }
}
