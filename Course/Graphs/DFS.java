package Course.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS 
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

    static void dfs(ArrayList<ArrayList<Edge>> graph, boolean[] visited, int src)
    {
        System.out.print(src + " ");
        visited[src] = true;
        for(int i = 0; i < graph.get(src).size(); i++)
        {
            Edge e = graph.get(src).get(i);
            if(!visited[e.des])
            {
                dfs(graph, visited, e.des);
            }
        }
    }
    
    public static void main(String[] ags)
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
            int w = sc.nextInt();
            graph.get(s).add(new Edge(s, d, w));
        }

        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                dfs(graph, visited, i);
            }
        }
        sc.close();
    }
}
