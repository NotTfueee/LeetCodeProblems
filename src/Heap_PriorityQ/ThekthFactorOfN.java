package Heap_PriorityQ;

import java.util.PriorityQueue;

public class ThekthFactorOfN {

    public static void main(String [] args)
    {
        System.out.println(kthFactor(12, 3));
    }


    public static int kthFactor(int n , int k )
    {
        var pq = new PriorityQueue<Integer>();

        for(int i = 1 ; i <= n ; i ++)
        {
            if(n % i == 0 )pq.add(i);
        }

        if( k > pq.size())return -1;

        int i = 0 ;

        while(i < k-1)
        {
            pq.remove();
            i++;
        }

        return pq.poll();

    }

}
