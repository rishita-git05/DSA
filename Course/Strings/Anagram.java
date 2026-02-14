package Course.Strings;
import java.util.*;

public class Anagram 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length())
        {
            System.out.println("Not anagram");
            return;
        }

        s1.toLowerCase();
        s2.toLowerCase();

        char sc1[] = s1.toCharArray();
        char sc2[] = s2.toCharArray();

        Arrays.sort(sc1);
        Arrays.sort(sc2);

        for(int i = 0; i < s1.length(); i++)
        {
            if(sc1[i] != sc2[i])
            {
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");
        sc.close();
    }
}
