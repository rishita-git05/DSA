import java.util.*;

public class Array
{
    static void changeArr(int[] arr, int i, int val)
    {
        //base condition
        if(i == arr.length)
            return;
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    static void printArr(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        printArr(arr, n);
        changeArr(arr, 0, 1);
        printArr(arr, n);
        sc.close();
    }
}