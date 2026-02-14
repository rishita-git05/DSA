package Course.Strings;
import java.util.*;

public class Compression 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            int count = 1;
            while(i < (n - 1) && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            System.out.print(str.charAt(i)+ "" + count);
        }
        System.out.println();
        sc.close();
    }
}