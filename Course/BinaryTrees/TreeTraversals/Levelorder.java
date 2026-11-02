package Course.BinaryTrees.TreeTraversals;
import Course.BinaryTrees.BuildTree;
import java.util.*;

public class Levelorder 
{
    static void levelorder(BuildTree.Node root)
    {
        if(root == null)
        {
            return;
        }

        Queue<BuildTree.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            BuildTree.Node curr = q.remove();
            if(curr == null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(curr.data + " ");
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null) //don't use else-if
                {
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.BinaryTree.idx = -1;
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);

        levelorder(root);
    }
}
