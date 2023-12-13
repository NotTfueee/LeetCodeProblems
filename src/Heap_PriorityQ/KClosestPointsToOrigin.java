package Heap_PriorityQ;

import java.util.*;

public class KClosestPointsToOrigin {

    public static void main(String[] args)
    {
        int[][] a = {{0,1},{1,0}};

        System.out.println(Arrays.deepToString(close(a , 2)));

    }

    public static int[][] close(int[][] points , int k )
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> Integer.compare((a[0]*a[0]+a[1]*a[1]),(b[0]*b[0] + b[1]*b[1]))
        );

        for(int[] val : points)pq.add(val);


        int[][] ans = new int[k][];
        int i = 0;
        while(i < k)
        {
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
}
