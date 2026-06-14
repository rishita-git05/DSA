public class Search 
{
    public static int searchIt(int key)
    {
        LinkedList.Node temp = LinkedList.head;
        int i = 0;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int helper(LinkedList.Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }

        return idx + 1;
    }

    public static int searchRec(int key)
    {
        return helper(LinkedList.head, key);
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addPos(3, 2);
        int key = 3;
        System.out.println(searchIt(key));
        System.out.println(searchRec(key));
    }
}
