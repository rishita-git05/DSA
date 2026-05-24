import java.util.*;

public class Majority 
{
    //Approach - 1
    /*static int countMaj(int[] arr, int i)
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
    }*/
    //Approach - 2
    static public int majorityElement(int[] arr)
    {
        return divide(arr, 0, arr.length - 1);
    }

    static private int divide(int[] arr, int l, int r)
    {
        if(l == r)
            return arr[l];

        int mid = l + (r - l) / 2;
        //Solve left and right
        int leftMaj = divide(arr, l, mid);
        int rigthMaj = divide(arr, mid + 1, r);

        //If both agree
        if(leftMaj == rigthMaj)
            return leftMaj;

        //Count both candidates
        int leftCount = count(arr, leftMaj, l, r);
        int rightCount = count(arr, rigthMaj, l , r);

        return (leftCount > rightCount)? leftMaj : rigthMaj;
    }

    static private int count(int[] arr, int cand, int l, int r)
    {
        int cnt = 0;

        for(int i = l; i <= r; i++)
        {
            if(arr[i] == cand)
                cnt++;
        }

        return cnt;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //System.out.println(countMaj(arr, 0));
        System.out.println(majorityElement(arr));
        sc.close();
    }
}
