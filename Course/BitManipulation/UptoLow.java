package Course.BitManipulation;

public class UptoLow 
{
    public static void main(String[] args)
    {
        for(char c = 'A'; c <= 'Z'; c++)
        {
            System.out.print((char)(c | ' ') + " ");
        }
    }
}
