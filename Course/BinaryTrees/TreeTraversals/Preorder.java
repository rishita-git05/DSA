package Course.BinaryTrees.TreeTraversals;

import Course.BinaryTrees.BuildTree;

public class Preorder 
{
    static void preorder(BuildTree.Node node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.BinaryTree.idx = -1;
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);

        preorder(root);
    }
}
