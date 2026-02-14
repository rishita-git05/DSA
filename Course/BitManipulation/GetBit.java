package Course.BitManipulation;
import java.util.Scanner;

public class GetBit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if((n & (1 << i)) == 0)
        {
            System.out.println("0");
            return;
        }
        System.out.println("1");
        sc.close();
    }
}
