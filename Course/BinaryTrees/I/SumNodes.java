package Course.BinaryTrees.I;

public class SumNodes
{
    static int sum(BuildTree.Node root)
    {
        if(root == null)
            return 0;

        int l = sum(root.left);
        int r = sum(root.right);
        
        return l + r + root.data;
    }
    public static void main(String[] args) 
    {
        int[] nodes =  {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        System.out.println(sum(root));
    }
}
