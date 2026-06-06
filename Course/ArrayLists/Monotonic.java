import java.util.ArrayList;
import java.util.Scanner;

public class Monotonic 
{
    // static boolean mono(ArrayList<Integer> list)
    // {
    //     int lp = 0, rp = list.size() - 1;
    //     if(list.get(lp) < list.get(rp))
    //     {
    //         for(int i = 0; i < list.size() - 1; i++)
    //         {
    //             if(list.get(i) > list.get(i + 1))
    //                 return false;
    //         }
    //     }
    //     else
    //     {
    //         for(int i = 0; i < list.size() - 1; i++)
    //         {
    //             if(list.get(i) < list.get(i + 1))
    //                 return false;
    //         }
    //     }
    //     return true;
    // }

    static boolean mono(ArrayList<Integer> list)
    {
        boolean inc = true;
        boolean dec = true;

        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i + 1))
            {
                inc = false;
            }
            else
            {
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.println(mono(list));
        sc.close();
    }
}
