package Course.BinaryTrees.I;

public class CountNodes
{
    static int count(BuildTree.Node root)
    {
        if(root == null)
            return 0;

        int l = count(root.left);
        int r = count(root.right);

        return l + r + 1;
    }
    public static void main(String[] args) 
    {
        int[] nodes =  {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        System.out.println(count(root));
    }
}
