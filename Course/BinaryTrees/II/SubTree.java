package Course.BinaryTrees.II;

import Course.BinaryTrees.I.BuildTree;

public class SubTree 
{
    static boolean identical(BuildTree.Node root, BuildTree.Node subroot)
    {
        if(root == null && subroot == null)
        {
            return true;
        }
        else if(root == null || subroot == null || root.data != subroot.data)
        {
            return false;
        }

        if(!identical(root.left, subroot.left))
        {
            return false;
        }

        if(!identical(root.right, subroot.right))
        {
            return false;
        }

        return true;
    }
    static boolean subtree(BuildTree.Node root, BuildTree.Node subroot)
    {
        if(root == null)
            return false;

        if(root.data == subroot.data)
        {
            if(identical(root, subroot))
                return true;
        }

        return subtree(root.left, subroot) || subtree(root.right, subroot);
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BuildTree.BinaryTree.idx = -1;
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);

        int[] sub = {2, 4, -1, -1, 5, -1, -1};
        BuildTree.BinaryTree.idx = -1;
        BuildTree.Node subroot = BuildTree.BinaryTree.build(sub);
        System.out.println(subtree(root, subroot));
    }
}
