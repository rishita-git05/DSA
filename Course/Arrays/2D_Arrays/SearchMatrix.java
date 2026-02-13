import java.util.Scanner;;

public class SearchMatrix 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                matrix[r][c] = sc.nextInt();
            }
        }

        int key = sc.nextInt();
        
        //Brute force method O(n^2)

        // for(int r = 0; r < rows; r++)
        // {
        //     for(int c = 0; c < cols; c++)
        //     {
        //         if(matrix[r][c] == key)
        //         {
        //             System.out.println("Found at (" + r + ", " + c + ")");
        //             return;
        //         }
        //     }
        // }
        // System.out.println("Not found");

        //Using Binary Search on each row O(n log n)
        // for(int r = 0; r < rows; r++)
        // {
        //     int low = 0, high = cols - 1;

        //     while(low <= high)
        //     {
        //         int mid = (low + high) / 2;

        //         if(matrix[r][mid] == key)
        //         {
        //             System.out.println("Found at (" + r + ", " + mid + ")");
        //             return;
        //         }
        //         else if(matrix[r][mid] < key)
        //         {
        //             low = mid + 1;
        //         }
        //         else
        //         {
        //             high = mid - 1;
        //         }
        //     }
        // }
        // System.out.println("Not found.");

        //Using staircase method O(n+m)
        int row = 0, col = cols - 1;
        while(row < rows && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("Found at (" + row + ", " + col + ")");
                return;
            }
            else if(matrix[row][col] > key)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Not found.");
    }
}
