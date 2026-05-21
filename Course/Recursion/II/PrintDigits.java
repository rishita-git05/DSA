import java.util.*;

public class PrintDigits 
{
    static void print(int n)
    {
        String[] map = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (n == 0)
        {
            return;
        }

        int lastDigit = n % 10;
        print(n/10);
        System.out.print(map[lastDigit] + " ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
