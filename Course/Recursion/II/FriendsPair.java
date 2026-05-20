import java.util.*;

public class FriendsPair
{
    static int pairing(int n)
    {
        if (n == 1 || n == 2)
        {
            return n;
        }

        return pairing(n - 1) + pairing(n - 1) * pairing(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pairing(n));
        sc.close();
    }
}