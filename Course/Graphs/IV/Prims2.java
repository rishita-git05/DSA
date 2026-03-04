package Course.Graphs.IV;

import java.util.*;

public class Prims2
{
    static class Edge
    {
        int s;
        int d;
        int w;
        Edge(int s, int d, int w)
        {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static void prims(ArrayList<ArrayList<Edge>> graph)
    {
        boolean[] vis = new boolean[graph.size()];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); //sort by cost
        pq.add(new int[]{0, 0});
        int finalCost = 0;

        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            int v = curr[0];
            int cost = curr[1];
            if(!vis[v])
            {
                vis[v] = true;
                finalCost += cost;

                for(int i = 0; i < graph.get(v).size(); i++)
                {
                    Edge e = graph.get(v).get(i);
                    pq.add(new int[]{e.d, e.w});
                }
            }
        }
        System.out.println("Min cost: " + finalCost);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i = 0; i <  V; i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < E; i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            graph.get(s).add(new Edge(s, d, w));
            graph.get(d).add(new Edge(d, s, w));
        }
        prims(graph);
        sc.close();
    }
}
