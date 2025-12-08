package Course.Patterns.II;

/*
   *   
  ***
 *****
*******
 *****
  ***
   *
*/

import java.util.Scanner;

public class Diamond 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n - r; c++)
            {
                System.out.print(" ");
            }
            for(int c = 1; c <= 2*r - 1; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int r = n - 1; r >= 1; r--)
        {
            for(int c = 1; c <= n - r; c++)
            {
                System.out.print(" ");
            }
            for(int c = 1; c <= 2*r - 1; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
