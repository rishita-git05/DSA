package Course.BitManipulation;
import java.util.Scanner;

public class CountSetBits 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1011 - 3
        //1100 - 2
        //1010 - 2
        //we can do 1010 -> 0101 -> 0010 -> 0001 -> 0000 look at lsbs
        int count = 0;
        while(n > 0)
        {
            if((n & 1) != 0)
            {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
        sc.close();
    }
}
