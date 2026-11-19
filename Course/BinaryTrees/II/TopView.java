package Course.BinaryTrees.II;

import Course.BinaryTrees.I.BuildTree;
import java.util.*;

public class TopView 
{
    static class Info
    {
        BuildTree.Node node;
        int hd;

        Info(BuildTree.Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void top(BuildTree.Node root)
    {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, BuildTree.Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty())
        {
            Info curr = q.remove();
            if(curr == null)
            {
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
                if(!map.containsKey(curr.hd))
                {
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null)
                {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if(curr.node.right != null)
                {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for(int i = min; i <= max; i++)
        {
            System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        top(root);
    }
}
