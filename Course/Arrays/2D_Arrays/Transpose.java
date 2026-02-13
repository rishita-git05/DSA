import java.util.Scanner;

public class Transpose 
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

        for(int c = 0; c < cols; c++)
        {
            for(int r = 0; r < rows; r++)
            {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
