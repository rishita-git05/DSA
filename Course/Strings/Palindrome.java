import java.util.*;

public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // StringBuilder sb = new StringBuilder(str);
        // String rev = sb.reverse().toString();
        // if(str.equals(rev))
        // {
        //     System.out.println("Palindrome");
        // } 
        // else
        // {
        //     System.out.println("Not palindrome");
        // }
        int n = str.length();
        for(int i = 0; i < n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
        sc.close();
    }
}
