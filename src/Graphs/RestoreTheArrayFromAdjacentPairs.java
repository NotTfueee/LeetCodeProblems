package Graphs;

//File Created by -- > anuragbhatt
//Created On -- > 10/11/23,Friday

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RestoreTheArrayFromAdjacentPairs {

    public static void main(String[] args) {

        int[][] arr = {{4,-2} , {1,4} , {-3,1}};

        System.out.println(Arrays.toString(restoreArray(arr)));

    }

    public static class Edge
    {
        int source ;
        int neighbour ;
        Edge(int source , int neighbour)
        {
            this.source = source;
            this.neighbour = neighbour;
        }
    }

    static String finalPath ;
    public static int[] restoreArray(int[][] adjPair)
    {
        var set = new HashSet<Integer>();
        int[] ans = new int[adjPair.length+1];

        for(int i = 0 ; i < adjPair.length ; ++i)
        {
            for(int j = 0 ; j < adjPair[0].length ; ++j)
            {
                int num = adjPair[i][j];
                if(!set.contains(num))set.add(num);
                else set.remove(num);
            }
        }

        int j = 0 , src = 0 , dst = 0;

        for(int val : set)
        {
            if(j == 0)src = val;
            else dst = val;
            j++;
        }

        ArrayList<Edge>[] graph = new ArrayList[adjPair.length + 2];

        for(int i = 0 ; i < adjPair.length+2 ; ++i)
        {
            graph[i] = new ArrayList<Edge>();
        }

        for(int i = 0 ; i < adjPair.length ; ++i)
        {
            int s = (int)Math.abs(adjPair[i][0]);
            int d = (int)Math.abs(adjPair[i][1]);

            graph[s].add(new Edge(s , d));
            graph[d].add(new Edge(d , s));
        }

        boolean [] visited = new boolean[adjPair.length+2];
         finalPath = "";

        findPath(graph , src ,  dst, "" , visited);

        System.out.println(finalPath);

        return ans;
    }

    public static void findPath(ArrayList<Edge>[] graph , int src , int dst , String path , boolean[] visited)
    {
        if(src == dst)
        {
            path += dst;
            finalPath = path;
            return;
        }

        visited[(int)Math.abs(src)] = true;

        for(Edge e : graph[(int)Math.abs(src)])
        {
            if(!visited[(int)Math.abs(e.neighbour)])
            {
                findPath(graph , e.neighbour , dst , path +e.neighbour + " " , visited);
            }
        }

        visited[(int)Math.abs(src)] = false;
    }


}
