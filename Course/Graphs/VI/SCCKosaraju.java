package Course.Graphs.VI;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class SCCKosaraju 
{
    static class Edge
    {
        int s;
        int d;
        Edge(int s, int d)
        {
            this.s = s;
            this.d = d;
        }
    }

    public static void topoSort(ArrayList<ArrayList<Edge>> graph, int curr, boolean[] vis, Stack<Integer> stack)
    {
        vis[curr] = true;
        for(int i = 0; i < graph.get(curr).size(); i++)
        {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.d])
            {
                topoSort(graph, e.d, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void dfs(ArrayList<ArrayList<Edge>> graph, boolean[] vis, int curr)
    {
        vis[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0; i < graph.get(curr).size(); i++)
        {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.d])
            {
                dfs(graph, vis, e.d);
            }
        }
    }
    public static void kosaraju(ArrayList<ArrayList<Edge>> graph, int V)
    {
        //Step-1: storing elements in a stack
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[graph.size()];

        for(int i = 0; i < V; i++)
        {
            if(!vis[i])
            {
                topoSort(graph, i, vis, stack);
            }
        }

        //Step-2: Transpose
        ArrayList<ArrayList<Edge>> transpose = new ArrayList<>();
        for(int i = 0; i < graph.size(); i++)
        {
            vis[i] = false; // important
            transpose.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++)
        {
            for(int j = 0; j < graph.get(i).size(); j++)
            {
                Edge e = graph.get(i).get(j); //e.s -> e.d
                //need to reverse the edge
                transpose.get(e.d).add(new Edge(e.d, e.s));
            }
        }

        //Step-3: reverse dfs on stack elements
        while(!stack.isEmpty())
        {
            int curr = stack.pop();
            if(!vis[curr])
            {
                System.out.print("SCC -> ");
                dfs(transpose, vis, curr);
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for(int i = 0; i < V; i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < E; i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            graph.get(s).add(new Edge(s, d));
        }
        kosaraju(graph, V);
        sc.close();
    }
}
