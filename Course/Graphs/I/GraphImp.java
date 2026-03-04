import java.util.*;

public class GraphImp 
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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i = 0; i < V; i++)
        {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < E; i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            graph[s].add(new Edge(s, d, w));
        }
        
        System.out.println("\nAdjacency List:");
        for(int i = 0; i < V; i++)
        {
            System.out.print(i + " -> ");
            for(Edge e : graph[i])
            {
                System.out.print("(" + e.des + ", " + e.weight + ") ");
            }
            System.out.println();
        }
    }
}
