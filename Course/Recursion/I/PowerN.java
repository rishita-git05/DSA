import java.util.*;

public class PowerN 
{
    static int poweropt(int n, int x)
    {
        if (x == 0)
            return 1;
        int op = poweropt(n, x/2) * poweropt(n, x/2);
        if (x % 2 != 0)
        {
            return n * op;
        }
        return op;
    }

    static int power(int n, int x)
    {
        if (x == 0)
            return 1;
        return n * power(n, x-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        //System.out.println(power(n, x));
        System.out.println(poweropt(n, x));
        sc.close();
    }
}
