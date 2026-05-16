import java.util.*;

public class Occurrence
{
    static int firstOccurrence(int key, int[] arr, int i)
    {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return firstOccurrence(key, arr, i + 1);
    }
    static int lastOccurrence(int key, int[] arr, int i)
    {
        if(i == arr.length)
            return -1;

        int isFound = lastOccurrence(key, arr, i + 1);
        
        if (arr[i] == key && isFound == -1)
            return i;
        return isFound;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("First occurrence: " + firstOccurrence(k, arr, 0));
        System.out.println("Last occurrence: " + lastOccurrence(k, arr, 0));
    }
}
