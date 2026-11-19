package Course.BinaryTrees.II;

import Course.BinaryTrees.I.BuildTree;
import Course.BinaryTrees.I.HeightTree;

public class Diameter 
{
    static int diameter(BuildTree.Node root) //O(n^2)
    {
        if(root == null)
            return 0;

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = HeightTree.height(root.left);
        int rh = HeightTree.height(root.right);
        int sd = lh + rh + 1;

        return Math.max(sd, Math.max(ld, rd));
    }

    static class Info
    {
        int diam;
        int ht;

        public Info(int diam, int ht)
        {
            this.diam = diam;
            this.ht = ht;
        }
    }

    static Info diameter2(BuildTree.Node root) //O(n)
    {
        if(root == null)
            return new Info(0, 0);

        Info linfo = diameter2(root.left);
        Info rinfo = diameter2(root.right);

        int diam = Math.max(Math.max(linfo.diam, rinfo.diam), linfo.ht + rinfo.ht + 1);
        int ht = Math.max(linfo.ht, rinfo.ht) + 1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) 
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree.Node root = BuildTree.BinaryTree.build(nodes);
        System.out.println(diameter(root));    
        System.out.println(diameter2(root).diam);
    }
}
