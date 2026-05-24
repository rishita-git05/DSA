import java.util.*;

public class Majority 
{
    static int countMaj(int[] arr, int i)
    {
        if(arr.length == 0)
            return -1;

        Arrays.sort(arr);

        while(i < arr.length)
        {
            int count = 1;

            while(i + 1 < arr.length && arr[i] == arr[i + 1])
            {
                count++;
                i++;
            }

            if(count > arr.length / 2)
                return arr[i];

            i++;
        }

        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(countMaj(arr, 0));
        sc.close();
    }
}
