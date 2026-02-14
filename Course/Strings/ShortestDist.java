package Course.Strings;
import java.util.Scanner;

public class ShortestDist 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String directions = sc.nextLine();
        int x = 0, y = 0;
        directions.toLowerCase();
        for(int i = 0; i < directions.length(); i++)
        {
            char c = directions.charAt(i);
            switch(c)
            {
                case 'n': y+=1; break;
                case 's': y-=1; break;
                case 'w': x-=1; break;
                case 'e': x+=1; break;
            }
        }
        double shortest = Math.sqrt((x*x) + (y*y));
        System.out.println(shortest);
        sc.close();
    }
}
