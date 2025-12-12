package Course.Arrays.I;

import java.util.Scanner;

public class BinarySearch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = 0, end = n - 1;
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] == target)
            {
                System.out.println("Found at index : " + mid);
                return;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        System.out.println("Not Found");
        sc.close();
    }
}
