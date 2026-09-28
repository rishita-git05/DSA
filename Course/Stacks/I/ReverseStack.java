import java.util.Stack;

public class ReverseStack
{
    static void pushAtBottom(Stack<Integer> stack, int data)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    static void reverseStack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
}