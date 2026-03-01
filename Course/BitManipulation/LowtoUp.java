package Course.BitManipulation;

public class LowtoUp 
{
    public static void main(String[] args)
    {
        for(char c = 'a'; c <= 'z'; c++)
        {
            System.out.print((char)(c & '_') + " ");
        }
    }
}
