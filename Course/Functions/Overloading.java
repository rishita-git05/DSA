package Course.Functions;

import java.util.Scanner;

public class Overloading 
{
    public static int sum(int a, int b)
    {
        return a + b;
    }

    //Using parameters
    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    //Using datatypes
    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(sum(d, e));
        sc.close();
    }
}
