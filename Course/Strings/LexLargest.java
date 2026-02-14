package Course.Strings;
import java.util.*;

public class LexLargest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str[] = {"Jungkook", "Army", "bts", "jk"};
        String largest = str[0];
        for(String s : str)
        {
            if(largest.compareTo(s) < 0)
            {
                largest = s;
            }
        }
        System.out.println(largest); //jk
        for(String s : str)
        {
            if(largest.compareToIgnoreCase(s) < 0)
            {
                largest = s;
            }
        }
        System.out.println(largest); // Jungkook
    }
}
