package Course.BinaryTrees.III;

import java.util.ArrayList;

import Course.BinaryTrees.I.BuildTree;

public class LowestCommonAncestor 
{
    public static boolean getPath(BuildTree.Node root, int n1, ArrayList<BuildTree.Node> path)
    {
        if(root == null)
            return false;

        path.add(root); //path1 = [1]

        if(root.data == n1) //1 != 4
            return true;

        boolean foundL = getPath(root.left, n1, path); // path1 = [1, 2, 4] return true
        boolean foundR = getPath(root.right, n1, path);

        if(foundL || foundR)
            return true;

        path.remove(path.size() - 1);
        return false;
    }
    public static BuildTree.Node lca(BuildTree.Node root, int n1, int n2)
    {
        ArrayList<BuildTree.Node> path1 = new ArrayList<>(); //[]
        ArrayList<BuildTree.Node> path2 = new ArrayList<>(); //[]

        getPath(root, n1, path1); //path1 = [1, 2, 4]
        getPath(root, n2, path2); //path2 = [1, 3, 6]

        int i = 0;
        for(; i < path1.size() && i < path2.size(); i++)
        {
            if(path1.get(i) != path2.get(i)) //1 == 1, 2 != 3 break
            {
                break; //i = 1
            }
        }

        BuildTree.Node lca = path1.get(i - 1); //path1.get(0) = 1
        return lca;
    }

    public static BuildTree.Node lca2(BuildTree.Node root, int n1, int n2)
    {
        if(root == null || root.data == n1 || root.data == n2)
        {
            return root;
        }

        BuildTree.Node leftlca = lca2(root.left, n1, n2);
        BuildTree.Node rightlca = lca2(root.right, n1, n2);

        if(leftlca == null)
            return rightlca;

        if(rightlca == null)
            return leftlca;

        return root;
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        int n1 = 4, n2 = 5;
        //System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);
    }
}
