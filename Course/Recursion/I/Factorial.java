import java.util.*;

public class Factorial 
{
    static int factorial(int n)
    {
        if (n < 2)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
