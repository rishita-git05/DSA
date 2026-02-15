package Course.BitManipulation;
import java.util.Scanner;

public class PowerOf2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //10, 100, 1000, 10000
        // 4&3 = 100 & 011 = 0
        // 8&7 = 1000 & 0111 = 0
        if((n & (n-1)) == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        sc.close();
    }
}
