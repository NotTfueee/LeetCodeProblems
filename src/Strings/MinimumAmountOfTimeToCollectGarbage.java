package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 20/11/23,Monday

import java.util.HashMap;

public class MinimumAmountOfTimeToCollectGarbage {

    public static void main(String[] args) {

        String [] arr = {"G","P","GP","GG"};
        int[] travel = { 2 , 4, 3};

        System.out.println(garbageCollection(arr , travel));
    }

    public static int garbageCollection(String[] garbage, int[] travel)
    {
        var map = new HashMap<Character , Integer>();
        int total = 0;
        for(int i = 0 ; i < garbage.length ; ++i)
        {
            String item = garbage[i];

            if(item.contains("M"))
            {
                map.put('M' , i);
            }

            if(item.contains("P"))
            {
                map.put('P' , i);
            }

            if(item.contains("G"))
            {
                map.put('G' , i);
            }

            total += item.length();
        }

        int time = 0 ;
        for(Character c : map.keySet())
        {
            int val = map.get(c);

            for(int i = 0 ; i < val ; ++i)
            {
                time += travel[i];
            }
        }


        return time+total;
    }
}
