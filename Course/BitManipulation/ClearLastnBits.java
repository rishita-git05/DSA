package Course.BitManipulation;
import java.util.Scanner;

public class ClearLastnBits 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        //Mthod 1
        // int x = 0;
        // while(i > 0)
        // {
        //     n = n & ~(1 << x);
        //     x++;
        //     i--;
        // }

        //Method 2
        n = n & (~0 << i);
        System.out.println(n);
        sc.close();
    }
}
// 111 - 100
// 111 - 110 = 111 & 110 (~001) - 110
// 110 - 100 = 110 & 101 (~010) - 100