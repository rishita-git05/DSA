import java.util.*;

public class Merge_Str
{
    static void mergeSort(String[] arr, int l, int r)
    {
        if (l >= r)
            return;

        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
    static void merge(String[] arr, int l, int mid, int r)
    {
        String[] temp = new String[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;
        
        while(i <= mid && j <= r)
        {
            if(arr[i].compareTo(arr[j]) <= 0)
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
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }
        mergeSort(arr, 0, n-1);
        for(String i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
