package Course.BinaryTrees.III;
import Course.BinaryTrees.I.BuildTree;

public class KthLevel 
{
    public static void klevel(BuildTree.Node root, int level, int k)
    {
        if(root == null)
            return;

        if(level == k)
        {
            System.out.print(root.data + " ");
            return;
        }

        klevel(root.left, level + 1, k);
        klevel(root.right, level + 1, k);
    }

    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        int k = 2;
        klevel(root, 2, k);
    }
}
