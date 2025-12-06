package Course.Functions;

import java.util.Scanner;

public class EvenOdd 
{
    static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if(isEven(n))
        {
            System.out.println(n + " is even.");
        }
        else
        {
            System.out.println(n + " is odd.");
        }
        sc.close();
    }    
}
