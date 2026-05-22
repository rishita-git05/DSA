import java.util.*;

public class Merge_S 
{
    static void mergeSort(int[] arr, int l, int r)
    {
        if(l >= r)
            return;

        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r)
    {
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= r)
        {
            if(arr[i] < arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
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

        for(k = 0, i = l; k < temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
