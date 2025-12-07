package Course.Patterns.II;

/*
    *
   **
  ***
 ****
*/

import java.util.Scanner;

public class InvRotHalfPyd 
{
    static void halfPyd(int rows)
    {
        for(int r = 1; r <= rows; r++)
        {
            for(int c = 1; c <= rows; c++)
            {
                if(c > (rows - r))
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
        System.out.println("Enter no.of rows:");
        int rows = sc.nextInt();
        halfPyd(rows);
        sc.close();
    }
}

/*
(or)
import java.util.Scanner;

public class InvRotHalfPyd {
    static void halfPyd(int rows) {
        for (int r = 1; r <= rows; r++) {
            // Print spaces
            for (int s = 1; s <= rows - r; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= r; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows = sc.nextInt();
        halfPyd(rows);
        sc.close();
    }
}
*/