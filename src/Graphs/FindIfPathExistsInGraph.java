package Graphs;

//File Created by -- > anuragbhatt
//Created On -- > 06/11/23,Monday

import java.util.ArrayList;

public class FindIfPathExistsInGraph {

    public static class Edge
    {
        int source;
        int neighbour;

        Edge(int source , int neighbour)
        {
            this.source = source;
            this.neighbour = neighbour;
        }
    }

    public static void main(String[] args) {

        int n = 6;
        int[][] edges = { {0,1} , {0,2} , {3,5} , {5,4} , {4,3} };

        ArrayList<Edge>[] graph = new ArrayList[n];

        for(int i = 0 ; i < n ; ++i)
        {
            graph[i] = new ArrayList<Edge>();
        }

        for(int i = 0 ; i < n - 1 ; ++i)
        {
            int source = edges[i][0];
            int neighbour = edges[i][1];

            graph[source].add(new Edge(source , neighbour));
            graph[neighbour].add(new Edge(neighbour , source));
        }

        boolean [] visited = new boolean[n];

        System.out.println(valid(graph , 0 , 5 , visited));
    }

    public static boolean valid(ArrayList<Edge>[] graph , int src , int dst , boolean[] visited)
    {
        if(src == dst)return true;

        visited[src] = true;

        for(Edge edge : graph[src])
        {
            if(!visited[edge.neighbour])
            {
                if(valid(graph , edge.neighbour , dst , visited))return true;
            }
        }

        return false;
    }
}
