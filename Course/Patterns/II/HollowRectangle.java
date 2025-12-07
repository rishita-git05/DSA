package Course.Patterns.II;

/*
*******
*     *
*     *
*******
*/

import java.util.Scanner;

public class HollowRectangle 
{
    static void hollow_rectangle(int rows, int cols)
    {
        for(int r = 1; r <= rows; r++)
        {
            for(int c = 1; c <= cols; c++)
            {
                if(r == 1 || r == rows || c == 1 || c == cols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();
        hollow_rectangle(rows, cols);
        sc.close();
    }
}
