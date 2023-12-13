package Heap_PriorityQ;

//File Created by -- > anuragbhatt
//Created On -- > 23/10/23,Monday

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReduceArraySizeToHalf {

    public static void main(String[] args) {

        int[] arr = {7,7,7,7,7,7};

        System.out.println(reduce(arr));
    }

    public static class Pair
    {
        int num;
        int freq;

        Pair(int num , int freq)
        {
            this.num = num;
            this.freq = freq;
        }
    }

    public static int reduce(int[] arr)
    {
        var map = new HashMap<Integer , Integer>();
        var q = new PriorityQueue<Pair>(Comparator.comparingInt((Pair p) -> p.freq).reversed());

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for(int num : map.keySet())
        {
            q.add(new Pair(num , map.get(num)));
        }

        int sum = 0 , count = 0 ;

        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            sum += curr.freq ;
            count ++;

            if(sum >= arr.length / 2)break;
        }


        return count;
    }

}
