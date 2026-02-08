import java.util.Scanner;

public class Kadane 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i < n; i++)
        {
            curr += arr[i] + max;
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}
