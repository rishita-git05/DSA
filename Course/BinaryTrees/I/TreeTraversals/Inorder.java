package Course.BinaryTrees.I.TreeTraversals;

import Course.BinaryTrees.I.BuildTree;

public class Inorder 
{
    static void inorder(BuildTree.Node node)
    {
        if(node == null)
        {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.BinaryTree.idx = -1;
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);

        inorder(root);
    }
}
