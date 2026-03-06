import java.util.*;

public class Articulate 
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

    public static void dfs(ArrayList<ArrayList<Edge>> graph, int curr, int parent, int[] dt, int[] low, int time, boolean[] vis)
    {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

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
                low[curr] = Math.min(low[curr], dt[neighbor]);
            }
            else
            {
                dfs(graph, neighbor, curr, dt, low, time, vis);
                low[curr] = Math.min(low[curr], low[neighbor]);

                if(parent != -1 && low[neighbor] >= dt[curr])
                {
                    System.out.println("Ap: " + curr);
                }
                children++;
            }
        }

        if(parent != -1 && children > 1)
        {
            System.out.println("Ap: " + curr);
        }
    }

    public static void getAP(ArrayList<ArrayList<Edge>> graph, int V)
    {
        int[] dt = new int[V];
        int[] low = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++)
        {
            if(!vis[i])
            {
                dfs(graph, i, -1, dt, low, time, vis);
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

        getAP(graph, V);
        sc.close();
    }
}
