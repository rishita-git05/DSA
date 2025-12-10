package Course.Arrays.I;

public class LinearSearch 
{
    static void linearSearch(int[] n, int key)
    {
        for(int i = 0; i < n.length; i++)
        {
            if(n[i] == key)
            {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args)
    {
        int[] n = {34, 56, 23, 89, 12, 67, 45};
        int key = 67;
        linearSearch(n, key);
    }
}
