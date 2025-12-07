package Course.Patterns.II;

/*
12345
1234
123
12
1
*/

import java.util.Scanner;

public class InvHalfPydNums 
{
    static void halfPydNum(int rows)
    {
        for(int r = 1; r <= rows; r++)
        {
            for(int c = 1; c <= (rows - r + 1); c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int rows = sc.nextInt();
        halfPydNum(rows);
        sc.close();
    }
}
