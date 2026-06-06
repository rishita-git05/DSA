import java.util.ArrayList;
import java.util.Scanner;

public class PairSum1 
{
    static boolean pairsum(ArrayList<Integer> list, int target)
    {
        int lp = 0, rp = list.size() - 1;
        while(lp != rp)
        {
            if(list.get(lp) + list.get(rp) == target)
            {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = sc.nextInt();
        System.out.println(pairsum(list, target));
        sc.close();
    }    
}
