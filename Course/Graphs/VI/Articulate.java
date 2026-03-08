import java.util.*;

public class Articulate 
{
    static int time = 0;

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

    public static void dfs(ArrayList<ArrayList<Edge>> graph, int curr, int parent, int[] disc, int[] low, boolean[] vis, boolean[] ap)
    {
        int children = 0;
        disc[curr] = low[curr] = ++time;

        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++)
        {
            Edge e = graph.get(curr).get(i);
            int neighbor = e.d;

            if(parent == neighbor)
            {
                continue;
            }
            else if(vis[neighbor])
            {
                low[curr] = Math.min(low[curr], disc[neighbor]);
            }
            else
            {
                dfs(graph, neighbor, curr, disc, low, vis, ap);
                low[curr] = Math.min(low[curr], low[neighbor]);

                if(parent != -1 && low[neighbor] >= disc[curr])
                {
                    ap[curr] = true;
                }
                children++;
            }
        }
        if(parent == -1 && children > 1)
        {
            ap[curr] = true; 
        }
    }

    public static void getAP(ArrayList<ArrayList<Edge>> graph, int V)
    {
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        boolean[] ap = new boolean[V];

        for(int i = 0; i < V; i++)
        {
            if(!vis[i])
            {
                dfs(graph, i, -1, disc, low, vis, ap);
            }
        }

        for(int i = 0; i < V; i++)
        {
            if(ap[i])
            {
                System.out.println("Articulation point: " + i);
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
            graph.get(d).add(new Edge(d, s));
        }

        getAP(graph, V);
        sc.close();
    }
}
