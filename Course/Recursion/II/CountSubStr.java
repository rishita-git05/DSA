import java.util.*;

public class CountSubStr 
{
    static int count(String s, int i, int j, int n)
    {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;
        int res = count(s, i + 1, j, n - 1) + count(s, i, j - 1, n - 1) - count(s, i + 1, j - 1, n - 2);
        if (s.charAt(i) == s.charAt(j))
            res++;
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(count(s, 0, n - 1, n));
        sc.close();
    }
}
