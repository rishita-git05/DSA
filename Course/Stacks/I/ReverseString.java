import java.util.Stack;

public class ReverseString 
{
    public static String reverseString(String str)
    {
        Stack<Character> stack = new Stack<>();
        int idx = 0;

        while(idx < str.length())
        {
            stack.push(str.charAt(idx++));
        }

        StringBuilder result = new StringBuilder("");
        while(!stack.isEmpty())
        {
            char top = stack.pop();
            result.append(top);
        }
        return result.toString();
    }
    public static void main(String[] args) 
    {
        String str = "Hello World!";    
        System.out.println(reverseString(str));
    }
}
