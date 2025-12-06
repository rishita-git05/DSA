package Course.Functions;

import java.util.Scanner;

public class Palindrome 
{
    static int isPalindrome(int n)
    {
        int rev = 0;
        while(n > 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int pal = isPalindrome(n);
        if(pal == n)
        {
            System.out.println(n + " is a palindrome.");
        }
        else
        {
            System.out.println(n + " is not a palindrome.");
        }
        sc.close();
    }
}
