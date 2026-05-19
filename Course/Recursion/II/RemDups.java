import java.util.*;

public class RemDups
{
    static void duplicate(String s, int idx, StringBuilder new_s, boolean[] map)
    {
        //base case
        if (idx == s.length())
        {
            System.out.println(new_s);
            return;
        }
        //main
        char curr = s.charAt(idx);
        if(map[curr - 'a'] == true)
        {
            //duplicate
            duplicate(s, idx + 1, new_s, map);
        }
        else
        {
            map[curr - 'a'] = true;
            duplicate(s, idx + 1, new_s.append(curr), map);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        duplicate(s, 0, new StringBuilder(""), new boolean[26]);
        sc.close();
    }
}
