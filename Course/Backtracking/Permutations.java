package Course.Backtracking;
import java.util.*;

public class Permutations 
{
    static void permute(String s, String ans)
    {
        //base condition
        if(s.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            // "abcde" -> "ab" + "de"
            String news = s.substring(0, i) + s.substring(i + 1);
            // abde, ""+a
            permute(news, ans+curr);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permute(s, "");
        sc.close();
    }
}
