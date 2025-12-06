package Course.Functions;

import java.util.Scanner;

public class DecToBin 
{
    static int dectobin(int n)
    {
        int bin = 0;
        int pow = 1;
        while(n > 0)
        {
            int rem = n % 2;
            bin = bin + (rem * pow);
            n /= 2;
            pow *= 10;
        }
        return bin;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int dec = sc.nextInt();
        int bin = dectobin(dec);
        System.out.println("Binary value: " + bin);
        sc.close();
    }    
}
