package Course.Patterns.II;

/*
0
1 0
0 1 0
1 0 1 0
*/

import java.util.Scanner;

public class ZeroOneTriangle 
{
    static void zeroOne(int rows)
    {
        for(int r = 1; r <= rows; r++)
        {
            for(int c = 1; c <= r; c++)
            {
                if((r+c) % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int rows = sc.nextInt();
        zeroOne(rows);
        sc.close();
    }
}
