package Graphs;

//File Created by -- > anuragbhatt
//Created On -- > 26/11/23,Sunday

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCostToConnectAllPoints {

    public static void main(String[] args) {

        int[][] points = {{0 , 0 } , {2,2} , {3,10} , {5,2} , {7,0}};

        System.out.println(minCostConnectPoints(points));
    }

    public static int minCostConnectPoints(int [][] points)
    {
        int n = points.length;

        boolean[] visited = new boolean[n];
        // array to store the minimum distance from one point to the another using dijsktra  algo
        int[] dist = new int[n];
        Arrays.fill(dist , Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0,0});

        int sum = 0;

        while(!pq.isEmpty())
        {
            int[] top = pq.remove();
            int v = top[0];
            int w = top[1];

            if(visited[v])continue;

            visited[v] = true;
            sum += w;

            // this loops run for every point and calculates the minimum distance between 2 points using dijsktra
            // for the current vertex we have in our priority queue and the value of i which denotes every other point in the plane
            for(int i = 0 ; i < n ; ++i)
            {
                if(!visited[i])
                {
                    int distance = Math.abs(points[v][0] - points[i][0]) + Math.abs(points[v][1] - points[i][1]);
                    // after calculating the minimum distance from v vertex to every other point we will store the minimum distance
                    // at the destination node as it is the distance to reach from v vertex to the ith vertex
                    if(dist[i] > distance)
                    {
                        dist[i] = distance;
                        pq.add(new int[] {i , distance});
                    }
                }
            }
        }

        return sum ;
    }
}
