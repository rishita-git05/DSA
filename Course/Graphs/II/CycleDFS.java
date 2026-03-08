package Course.Graphs.II;

import java.util.*;
public class CycleDFS 
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

    public static boolean detectCycle(ArrayList<ArrayList<Edge>> graph, int V)
    {
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            if(!vis[i])
                if(detectCycleUtil(graph, vis, i, -1))
                    return true;
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<ArrayList<Edge>> graph, boolean[] vis, int curr, int parent)
    {
        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++)
        {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.d] && detectCycleUtil(graph, vis, e.d, curr))
            {
                return true;
            }
            else if(vis[e.d] && e.d != parent)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++)
            graph.add(new ArrayList<>());
        for(int i = 0; i < E; i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            graph.get(s).add(new Edge(s, d));
            graph.get(d).add(new Edge(d, s));
        }

        System.out.println(detectCycle(graph, V));
        sc.close();
    }
}
