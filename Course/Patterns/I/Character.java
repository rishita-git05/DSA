/*
A
BC
DEF
GHIJ
*/

import java.util.Scanner;

public class Character
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of lines:");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}