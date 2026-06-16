package Course.LinkedLists.II;
import Course.LinkedLists.I.LinkedList;

public class ZigZag 
{
    public static void zigzag()
    {
        //find mid node
        LinkedList.Node slow = LinkedList.head;
        LinkedList.Node fast = LinkedList.head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedList.Node mid = slow;
        //reverse second half
        LinkedList.Node curr = mid.next;
        mid.next = null;

        LinkedList.Node prev = null;
        LinkedList.Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        LinkedList.Node left = LinkedList.head;
        LinkedList.Node right = prev;

        LinkedList.Node nextL, nextR;
        //alternate merge

        while(left != null && right != null)
        {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }


    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        zigzag();
        ll.print();
    }
}
