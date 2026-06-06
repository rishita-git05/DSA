import java.util.ArrayList;

public class ContainMostWater 
{
    static int bruteForce(ArrayList<Integer> list)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                max = Math.max(max, (j - i) * Math.min(list.get(i), list.get(j)));
            }
        }
        return max;
    }

    static int pointers(ArrayList<Integer> list)
    {
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int right = 1; right < list.size(); right++)
        {
            if(left != right)
                max = Math.max(max, Math.abs(right - left) * Math.min(list.get(left), list.get(right)));
            if(list.get(right) > list.get(left))
                left++;
        }
        return max;
    }

    static int twoPtrs(ArrayList<Integer> list)
    {
        int max = Integer.MIN_VALUE;
        int lp = 0, rp = list.size() - 1;

        while(lp < rp)
        {
            int left = list.get(lp);
            int right = list.get(rp);

            max = Math.max(max, (rp - lp) * Math.min(left, right));
            if(left < right)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(bruteForce(list));
        System.out.println(pointers(list));    
        System.out.println(twoPtrs(list));
    }
}
