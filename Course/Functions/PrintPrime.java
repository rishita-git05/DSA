package Course.Functions;

import java.util.Scanner;

public class PrintPrime 
{
    public static boolean isPrime(int n)
    {
        if(n <= 1)
            return false;
        if(n == 2)
            return true;
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
        sc.close();
    }
}
