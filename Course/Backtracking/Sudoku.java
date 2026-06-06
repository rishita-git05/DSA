public class Sudoku 
{
    static boolean isSafe(int[][] sudoku, int row, int col, int digit)
    {
        //Same row
        for(int i = 0; i < 9; i++)
        {
            if(sudoku[i][col] == digit)
            {
                return false;
            }
        }
        //Same column
        for(int i = 0; i < 9; i++)
        {
            if(sudoku[row][i] == digit)
            {
                return false;
            }
        }
        //Same grid
        int sR = (row / 3) * 3;
        int sC = (col / 3) * 3;

        for(int i = sR; i < sR + 3; i++)
        {
            for(int j = sC; j < sC + 3; j++)
            {
                if(sudoku[i][j] == digit)
                    return false;
            }
        }
        return true;
    }

    static boolean solver(int[][] sudoku, int row, int col)
    {
        //base condition
        if(row == 9)
        {
            return true;
        }
        //recursion
        int nextR = row, nextC = col + 1;

        if(col + 1 == 9)
        {
            nextR = row + 1;
            nextC = 0;
        }

        if(sudoku[row][col] != 0)
            return solver(sudoku, nextR, nextC);

        for(int digit = 1; digit <= 9; digit++)
        {
            if(isSafe(sudoku, row, col, digit))
            {
                sudoku[row][col] = digit;
                if(solver(sudoku, nextR, nextC))
                    return true;
            }
            sudoku[row][col] = 0;
        }
        return false;
    }
    static void printSudoku(int[][] sudoku)
    {
        for(int i = 0; i < 9; i++)
        {
            System.out.print("|");
            for(int j = 0; j < 9; j++)
            {
                System.out.print(sudoku[i][j] + " ");
                if((j+1) % 3 == 0)
                    System.out.print("| ");
            }
            System.out.println();
            if((i+1) % 3 == 0)
                System.out.println("------------------------");
        }
    }
    public static void main(String[] args) 
    {
        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3},
        };

        if(solver(sudoku, 0, 0))
        {
            System.out.println("Solution exists!");
            printSudoku(sudoku);
        }
        else
        {
            System.out.println("Solution doesn't...");
        }
    }
}
