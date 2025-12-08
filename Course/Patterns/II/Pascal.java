package Course.Patterns.II;

import java.util.Scanner;

public class Pascal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int r = 0; r < n; r++) 
        {
            int num = 1;

            for (int c = 0; c < n - r; c++) 
            {
                System.out.print(" ");
            }

            for (int c = 0; c <= r; c++) 
            {
                System.out.print(num + " ");
                num = num * (r - c) / (c + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}