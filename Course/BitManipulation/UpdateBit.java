package Course.BitManipulation;

import java.util.Scanner;

public class UpdateBit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int newBit = sc.nextInt();

        n = (n & ~(1 << i));
        newBit = newBit << i;
        System.out.println(n | newBit);
        sc.close();
    }
}
