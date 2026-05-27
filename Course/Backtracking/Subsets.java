import java.util.*;

public class Subsets 
{
    static void subset(String s, String ans, int i) //i - the current char to inc/exc; ans the substring obtained
    {
        //base condition
        if(i == s.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //Including
        subset(s, ans + s.charAt(i), i + 1);
        //Not including
        subset(s, ans, i + 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subset(s, "", 0);
        sc.close();
    }
}
