package Course.Functions;

import java.util.Scanner;

public class BinToDec 
{
    static int binToDec(int bin)
    {
        int dec = 0, pow = 0;
        while(bin > 0)
        {
            int last = bin % 10;
            dec += last * Math.pow(2, pow);
            pow++;
            bin /= 10;
        }
        return dec;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int bin = sc.nextInt();
        int dec = binToDec(bin);
        System.out.println("Decimal value: " + dec);
        sc.close();
    }    
}
