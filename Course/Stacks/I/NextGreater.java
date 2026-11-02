import java.util.*;

// nums1 = {4, 1, 2}, nums2 = {1, 3, 2, 4}
// {-1, 3, 4}
// [1]
// 3 > 1 {1: 3} [] [3]
// 2 > 3 x [3, 2]
// 4 > 2 {2: 4} [3], 4 > 3 {3: 4} [] [4]
// {4: -1}
// {1: 3, 2: 4, 3: 4, 4: -1}
public class NextGreater
{
    static int[] next(int[] nums1, int[] nums2) 
    {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        stack.push(nums2[0]);
        for(int i = 1; i < nums2.length; i++)
        {
            while(!stack.isEmpty() && nums2[i] > stack.peek())
            {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while(!stack.isEmpty())
        {
            map.put(stack.pop(), -1);
        }
        
        for(int i = 0; i < nums1.length; i++)
        {
            nums1[i] = map.get(nums1[i]);
        }
        
        return nums1;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 2, 4};
        
        int[] result = next(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}