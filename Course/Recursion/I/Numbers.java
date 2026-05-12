import java.util.*;

public class Numbers 
{
    static void printInc(int n)
    {
        if (n == 0)
        {
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    static void printDec(int n)
    {
        if (n == 0)
        {
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
        System.out.println();
        printDec(n);
    }
}
