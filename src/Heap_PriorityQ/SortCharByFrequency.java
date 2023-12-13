package Heap_PriorityQ;

//File Created by -- > anuragbhatt
//Created On -- > 23/10/23,Monday

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharByFrequency {

    public static void main(String[] args) {

        System.out.println(sort("raaeaedere"));
    }

    public static class Pair
    {
        char ch ;
        int data;

        Pair(Character ch , int data)
        {
            this.ch = ch;
            this.data = data;
        }
    }
    public static String sort(String s)
    {
        var map = new HashMap<Character, Integer>();
        var q = new PriorityQueue<Pair>(Comparator.comparingInt((Pair p) -> p.data).reversed());

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            map.put(item , map.getOrDefault(item , 0 ) + 1);
        }

        for(Character c : map.keySet())
        {
            q.add(new Pair(c , map.get(c)));
        }

        String ans = "";

        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            int times = curr.data;

            for(int i = 0 ;i < times ; ++i)
            {
                ans += curr.ch;
            }
        }

        return ans;
    }
}
