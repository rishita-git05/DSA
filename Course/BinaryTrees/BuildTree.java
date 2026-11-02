package Course.BinaryTrees;

public class BuildTree 
{
    public static class Node
    {
        public int data;
        public Node left, right;
        Node(int data)
        {
            this.data = data;
        }
    }

    public static class BinaryTree
    {
        public static int idx = -1;
        public static Node build(int[] nodes)
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;
        }
    }
    public static void main(String[] args)
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.build(nodes);
        System.out.println(root.data);
    }
}
