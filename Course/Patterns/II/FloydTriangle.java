package Course.Patterns.II;

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;

public class FloydTriangle 
{
    static void floyd(int rows)
    {
        int counter = 1;
        for(int r = 1; r <= rows; r++)
        {
            for(int c = 1; c <= r; c++)
            {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
            int rows = sc.nextInt();
            floyd(rows);
            sc.close();
    }    
}
