import java.util.*;

public class GridWays 
{
    static int gridways(int i, int j, int n, int m)
    {
        //base condition
        if(i == n - 1 && j == m - 1)
        {
            return 1;
        }
        else if(i == n || j == m)
        {
            return 0;
        }
        //main
        return gridways(i + 1, j, n, m) + gridways(i, j + 1, n, m);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gridways(0, 0, n, m));
        sc.close();
    }
}
