import java.util.*;

public class Tiling 
{
    static int tiling(int n)
    {
        if(n == 0 | n == 1)
        {
            return 1;
        }

        int fnm1 = tiling(n - 1);
        int fnm2 = tiling(n - 2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tiling(n));
        sc.close();
    }
}
