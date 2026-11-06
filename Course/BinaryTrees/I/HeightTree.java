package Course.BinaryTrees.I;

public class HeightTree
{
    static int height(BuildTree.Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        System.out.println(height(root));
    }
}