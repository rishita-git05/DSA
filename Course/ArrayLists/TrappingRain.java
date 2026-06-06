import java.util.*;

public class TrappingRain 
{
    static int totalWater(ArrayList<Integer> height)
    {
        int left = 0, right = height.size() - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while(left < right)
        {
            if(height.get(left) <= height.get(right))
            {
                if(height.get(left) >= leftMax)
                {
                    leftMax = height.get(left);
                }
                else
                {
                    water += leftMax - height.get(left);
                }
                left++;
            }
            else if(height.get(right) < height.get(left))
            {
                if(height.get(right) >= rightMax)
                {
                    rightMax = height.get(right);
                }
                else
                {
                    water += rightMax - height.get(right);
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(totalWater(height));
    }
}
