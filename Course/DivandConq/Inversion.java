//Inversion - In an array when we encounter a > b pairs while comparing every element with the ones after it, we increment the count
import java.util.*;

public class Inversion
{
    //Approach - 1 (Brute Force)
    /*static int countInv(int[] arr)
    {
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }*/
    //Approach - 2 (Merge sort)
    static int mergeSort(int[] arr, int l, int r)
    {
        int count = 0;
        if (l < r)
        {
            int mid = l + (r - l) / 2;
            //count inversions in left half
            count += mergeSort(arr, l, mid);

            //count inversions in right half
            count += mergeSort(arr, mid + 1, r);

            //count split inversions
            count += merge(arr, l, mid, r);
        }
        return count;
    }
    static int merge(int[] arr, int l, int mid, int r)
    {
        int[] temp = new  int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        int count = 0;

        while(i <= mid && j <= r)
        {
            if(arr[i] < arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while(j <= r)
        {
            temp[k++] = arr[j++];
        }
        for (i = l, k = 0; i <= r; i++, k++)
        {
            arr[i] = temp[k];
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //System.out.println(countInv(arr));
        System.out.println(mergeSort(arr, 0, n - 1));
        sc.close();
    }
}