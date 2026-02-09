package Course.Sorting_Algs;
import java.util.Scanner;

public class InsertionSort 
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
        /* 5 4 1 3 2
           4 5 1 3 2
           1 4 5 3 2
           1 3 4 5 2
           1 2 3 4 5
        */
        for(int i = 1; i < n; i++)
        {
            int prev = i - 1;
            int curr = arr[i];
            while(prev >= 0 && curr < arr[prev])
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }    
}
