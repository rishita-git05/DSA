package Course.LinkedLists.II;
import Course.LinkedLists.I.LinkedList;

public class MergeSortLL 
{
    private static LinkedList.Node findMid(LinkedList.Node head)
    {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static LinkedList.Node merge(LinkedList.Node left, LinkedList.Node right)
    {
        LinkedList.Node mergedLL = new LinkedList.Node(-1);
        LinkedList.Node temp = mergedLL;

        while(left != null && right != null)
        {
            if(left.data < right.data)
            {
                temp.next = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while(left != null)
        {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right != null)
        {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public static LinkedList.Node mergeSort(LinkedList.Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        //find min node
        LinkedList.Node mid = findMid(head);
        
        //separate halfs
        LinkedList.Node rightHead = mid.next;
        mid.next = null;
        LinkedList.Node newLeft = mergeSort(head);
        LinkedList.Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addLast(1);
        ll.addPos(2, 2);
        ll.print();
        ll.head = mergeSort(ll.head);
        ll.print();
    }
}
