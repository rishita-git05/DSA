package Course.Arrays.II;

import java.util.Scanner;

public class MaxSumPrefix 
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
        for(int i = 1; i < n; i++)
        {
            arr[i] += arr[i - 1];
        }

        for(int i = 0; i < n; i++)
        {
            int start = i;
            for(int j = i; j < n; j++)
            {
                int end = j;
                int curr = 0;
                curr = start == 0 ? arr[end] : arr[end] - arr[start - 1];
                max = Math.max(max, curr);
            }
        }
        System.out.println(max);
    }
}
