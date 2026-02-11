package Course.Sorting_Algs;
import java.util.Scanner;

public class CountingSort 
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

        int[] count = new int[10];
        int[] output = new int[n+1];
        for(int i = 0; i < n; i++)
        {
            count[arr[i]]++;
        }
        for(int i = 1; i < 10; i++)
        {
            count[i] += count[i-1];
        }
        for(int i = n-1; i >= 0; i--)
        {
            output[--count[arr[i]]] = arr[i];
        }
        for(int i = 0; i < n; i++)
        {
            arr[i] = output[i];
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
