import java.util.ArrayList;
import java.util.Scanner;

public class PairSum2 
{
    static boolean pairsum(ArrayList<Integer> list, int target)
    {
        int bp = 0;
        int n = list.size();

        for(int i = 0; i < n; i++)
        {
            if(list.get(i) > list.get(i + 1)) //Rotated array pivot
            {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while(lp != rp)
        {
            if(list.get(lp) + list.get(rp) == target)
            {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target)
            {
                lp = (lp + 1) % n; //Modular Arithmetic
            }
            else
            {
                rp = (n + rp - 1) % n; //Modular Arithmetic
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum(list, target));
        sc.close();
    }
}
