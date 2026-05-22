import java.util.Scanner;

public class Quick_S 
{
    static void quickSort(int[] arr, int l, int r)
    {
        if(l >= r)
            return;

        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    static int partition(int[] arr, int l, int r)
    {
        int pivot = arr[r];
        int i = l - 1;

        for(int j = l; j < r; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[r] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
