package Course.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS 
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

    static void bfs(ArrayList<ArrayList<Edge>> graph, boolean[] visited, int src)
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        visited[src] = true;
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            System.out.print(curr + " ");

            for(int i = 0; i <  graph.get(curr).size(); i++)
            {
                Edge e = graph.get(curr).get(i);
                if(!visited[e.des])
                {
                    visited[e.des] = true;
                    q.add(e.des);
                }
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
            int w = sc.nextInt();
            graph.get(s).add(new Edge(s, d, w));
        }
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                bfs(graph, visited, i);
            }
        }
    }
}
