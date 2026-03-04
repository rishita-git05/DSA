package Course.Graphs.IV;

import java.util.*;

public class Prims 
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

    static class Pair implements Comparable<Pair>
    {
        int v;
        int cost;
        public Pair(int v, int cost)
        {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2)
        {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<ArrayList<Edge>> graph)
    {
        boolean[] vis = new boolean[graph.size()];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty())
        {
            Pair curr = pq.poll();
            if(!vis[curr.v])
            {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for(int i = 0; i < graph.get(curr.v).size(); i++)
                {
                    Edge e = graph.get(curr.v).get(i);
                    pq.add(new Pair(e.d, e.w));
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
            graph.get(d).add(new Edge(d, s, w)); //Undirected graph
        }
        prims(graph);
        sc.close();
    }
}
