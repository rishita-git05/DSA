import java.util.*;

public class LengthStr 
{
    static int calcLength(String s)
    {
        if (s.length() == 0)
        {
            return 0;
        }
        return calcLength(s.substring(1)) + 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(calcLength(s));
        sc.close();
    }
}
