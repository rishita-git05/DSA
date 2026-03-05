package Course.Graphs.VI;
import java.util.*;

public class Bridge 
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
    
    public static void dfs(ArrayList<ArrayList<Edge>> graph, int curr, int parent, int[] disc, int[] low, boolean[] vis, int time)
    {
        vis[curr] = true;
        disc[curr] = low[curr] = ++time;

        for(int i = 0; i <  graph.get(curr).size(); i++)
        {
            Edge e = graph.get(curr).get(i);
            int neighbor = e.d;

            if(neighbor == parent)
            {
                continue;
            }
            else if(!vis[neighbor])
            {
                dfs(graph, neighbor, curr, disc, low, vis, time);
                low[curr] = Math.min(low[curr], low[neighbor]);
                if(disc[curr] < low[neighbor])
                {
                    System.out.println("Bridge: " + curr + " - " + neighbor);
                }
            }
            else
            {
                low[curr] = Math.min(low[curr], disc[neighbor]);
            }
        }
    }

    public static void tarjans(ArrayList<ArrayList<Edge>> graph, int V, int curr)
    {
        int[] disc = new int[V];
        int[] low = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++)
        {
            if(!vis[i])
            {
                dfs(graph, i, -1, disc, low, vis, time);
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

        tarjans(graph, V, 0);
        sc.close();
    }
}
