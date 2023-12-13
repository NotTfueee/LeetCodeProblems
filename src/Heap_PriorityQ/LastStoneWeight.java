package Heap_PriorityQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main (String[] args)
    {
        int[] a = {2,7,4,1,8,1};
        System.out.println(remains(a));
    }

    public static int remains(int[] stones )
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < stones.length ; i ++)
        {
            pq.add(stones[i]);
        }


        while(pq.size() >= 2)
        {
            int a = pq.remove();
            int b = pq.remove();

            pq.add(Math.abs(a-b));
        }

        return pq.peek();
    }
}
