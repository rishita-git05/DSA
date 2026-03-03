import java.util.*;

public class NQueens 
{
    static int count = 0;
    static boolean isSafe(char[][] board, int row, int col)
    {
        //vertically up
        for(int i = row-1; i >= 0; i--)
        {
            if(board[i][col] == 'Q')
                return false;
        }
        //left diagonally
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if(board[i][j] == 'Q')
                return false;
        }
        //right digonally
        for(int i = row - 1, j = col + 1;i >= 0 && j < board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    static void nqueens(char[][] board, int row)
    {
        int n = board.length;
        //base condition
        if(row == n)
        {
            System.out.println("-------Board-------");
            printBoard(board);
            count++;
            return;
        }
        for(int j = 0; j < n; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = '.';
            }
        }
    }
    static void printBoard(char[][] board)
    {
        int n = board.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = '.';
            }
        }
        nqueens(board, 0);
        System.out.println("No.of solutions: " + count);
        sc.close();
    }
}
