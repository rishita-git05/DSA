import java.util.Scanner;

public class Occurences 
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
        int count = 0;
        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                if(key == matrix[r][c])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
