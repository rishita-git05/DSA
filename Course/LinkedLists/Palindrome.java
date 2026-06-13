public class Palindrome 
{
    public static boolean palindrome()
    {
        LinkedList.Node slow = LinkedList.head;
        LinkedList.Node fast = LinkedList.head;

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        LinkedList.Node prev = null;
        LinkedList.Node curr = slow;
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

        while(right != null)
        {
            if(left.data != right.data)
                return false;

            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(1);
        ll.addPos(2, 2);   
        System.out.println(palindrome());
    }    
}
