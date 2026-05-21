import java.util.*;

public class TowerHanoi 
{
    static void TOH(int n, char src, char aux, char des)
    {
        if(n == 1)
        {
            System.out.println("Moving disk " + n + " from " + src + " to " + des);
            return;
        }
        //transfer top n-1 from src to helper using des as aux
        TOH(n - 1, src, des, aux);
        //transfer nth from src to des
        System.out.println("Moving disk " + n + " from " + src + " to " + aux);
        //transfer n-1 from aux to des using src as aux
        TOH(n - 1, aux, src, des);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n, 'A', 'B', 'C');
        sc.close();
    }
}
