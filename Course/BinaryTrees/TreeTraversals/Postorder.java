package Course.BinaryTrees.TreeTraversals;

import Course.BinaryTrees.BuildTree;

public class Postorder 
{
    static void postorder(BuildTree.Node node)
    {
        if(node == null)
        {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.BinaryTree.idx = -1;
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);

        postorder(root);
    }
}
