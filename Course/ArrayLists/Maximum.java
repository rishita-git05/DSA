import java.util.*;

public class Maximum 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(4);
        int max = Integer.MIN_VALUE;
        for(int i : list)
            max = Math.max(max, i);
        System.out.println("Maximum element: "+ max);
    }
}
