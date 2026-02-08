package Course.Arrays.II;

import java.util.Scanner;

public class MaxSumBrute
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
        for(int i = 0; i < n; i++)  // loop through whole array
        {
            int start = i;  //start index of subarray
            for(int j = i; j < n; j++)  //loop through subarray
            {
                int end = j;
                int curr = 0;
                for(int k = start; k <= end; k++)   //sum elements of subarray
                {
                    curr += arr[k];
                }
                max = Math.max(max, curr);
            }
        }
        System.out.println(max);
    }
}
