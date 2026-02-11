import java.util.Scanner;

public class SpiralMatrix 
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
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        while(top<=bottom && left<=right)
        {
            //Left to right
            for(int c = left; c <= right; c++)
            {
                System.out.print(matrix[top][c] + " ");
            }
            top++;
            //Top to bottom
            for(int r = top; r <= bottom; r++)
            {
                System.out.print(matrix[r][right] + " ");
            }
            right--;
            if(top <= bottom)
            {
                //Right to left
                for(int c = right; c >= left; c--)
                {
                    System.out.print(matrix[bottom][c] + " ");
                }
                bottom--;
            }
            if(left <= right)
            {
                //Bottom to top
                for(int r = bottom; r >= top; r--)
                {
                    System.out.print(matrix[r][left] + " ");
                }
                left++;        
            }
        }
    }
}
