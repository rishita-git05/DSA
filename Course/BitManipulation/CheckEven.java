package Course.BitManipulation;
import java.util.Scanner;

public class CheckEven 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if((n & 1) == 0)
        {
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
}
