import java.util.Stack;

public class PushBottom 
{
    static void pushAtBottom(Stack<Integer> stack, int data)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }

        int top = stack.pop(); //remove all elements from bottom to top
        pushAtBottom(stack, data); //reach the bottom to perform insertion
        stack.push(top); // re-push the removed elements
    }
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int data = 4;
        pushAtBottom(stack, data);
        System.out.println(stack);
    }
}
