package Course.Graphs.IV;

import java.util.ArrayList;
import java.util.Scanner;

public class BellmanFord 
{
    static class Edge
    {
        int src;
        int des;
        int weight;
        Edge(int s, int d, int w)
        {
            src = s;
            des = d;
            weight = w;
        }
    }

    public static void bellmanFord(ArrayList<Edge> graph, int src, int V)
    {
        int[] dist = new int[V];
        for(int i = 0; i < dist.length; i++)
        {
            if(i != src)
                dist[i] = Integer.MAX_VALUE;
        }

        //O(V)
        for(int i = 0; i < V; i++)
        {
            //O(E)
            for(int j = 0; j < graph.size(); j++)
            {
                
                
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.des;
                int w = e.weight;
                //Relaxation
                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v])
                {
                    dist[v] = dist[u] + w;
                }
            }
        }
        for(int i = 0; i < dist.length; i++)
        {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
        //Total T(n) = O(V*E)
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<Edge> graph = new ArrayList<>();

        for(int i = 0; i < E; i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            graph.add(new Edge(s, d, w));
        }

        bellmanFord(graph, 0, V);


    }
}
