package Course.BitManipulation;
import java.util.Scanner;

public class ClearRange 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        // 100111010011 - 111100000011
        // 111100000000 (a) , 000000000011 (b)
        int a = ~0 << (j+1);
        int b = (1 << i) - 1; //2^i -1 why? 2^1-1 = 1 ; 2^2-1 = 3 (11) ; 2^3-1=7 (111)

        n = n & (a|b);
        System.out.println(n);
        sc.close();
    }
}
