package Course.Patterns.II;

/*
 4  4  4  4  4  4  4 
 4  3  3  3  3  3  4
 4  3  2  2  2  3  4
 4  3  2  1  2  3  4
 4  3  2  2  2  3  4
 4  3  3  3  3  3  4
 4  4  4  4  4  4  4
*/

import java.util.Scanner;

public class ConcentricSquare 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2 * n - 1;
        for(int r = 1; r <= size; r++)
        {
            for(int c = 1; c <= size; c++)
            {
                int top = r - 1;
                int left = c - 1;
                int right = size - c;
                int bottom = size - r;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(" " + (n - min) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
