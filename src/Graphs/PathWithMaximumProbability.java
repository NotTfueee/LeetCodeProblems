package Graphs;

//File Created by -- > anuragbhatt
//Created On -- > 24/11/23,Friday

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PathWithMaximumProbability {

    public static void main(String[] args) {

        int[][] edges = {{0,1}, {1,2}, {0,2}};
        double[] succProb = {0.5,0.5,0.3};

        System.out.println(maxProbability(3 , edges , succProb , 0 , 2));
    }

    public static class Edge
    {
        int source ;
        int neighbour ;
        double weight ;

        Edge(int source , int neighbour , double weight)
        {
            this.source = source;
            this.neighbour = neighbour ;
            this.weight = weight;
        }
    }
    public static class Pair
    {
        int v ;
        double w;

        Pair(int v , double w )
        {
            this.v = v;
            this.w = w;
        }
    }
    public static double maxProbability (int n , int[][] edges , double[] succProb , int start , int end)
    {
        ArrayList<Edge>[] graph = new ArrayList[n];

        for(int i = 0 ; i < n ; ++i)
        {
            graph[i] = new ArrayList<Edge>();
        }

        for(int i = 0 ; i < edges.length ; ++i)
        {
            int s = edges[i][0] , neigh = edges[i][1];
            double w = succProb[i];

            graph[s].add(new Edge(s , neigh , w));
            graph[neigh].add(new Edge(neigh , s , w));
        }

        Comparator<Pair> pairComparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Double.compare(p2.w, p1.w); // Reversed comparison for maximum weight first
            }
        };

        boolean[] visited = new boolean[n];

        double [] distance = new double[n];
        Arrays.fill(distance , Integer.MIN_VALUE);
        distance[start] = 1;

        PriorityQueue<Pair> pq = new PriorityQueue<>(pairComparator);
        pq.add(new Pair(start , 1));

        while(!pq.isEmpty())
        {
            Pair top = pq.remove();

            if(visited[top.v])continue;

            visited[top.v] = true;

            for(Edge e : graph[top.v])
            {
                if(!visited[e.neighbour])
                {
                    double newDistance = top.w * e.weight;

                    if(newDistance > distance[e.neighbour])
                    {
                        distance[e.neighbour] = newDistance;

                        pq.add(new Pair(e.neighbour , newDistance));
                    }
                }
            }

        }

        return distance[end] != Integer.MIN_VALUE ? distance[end] : 0;
    }
}
