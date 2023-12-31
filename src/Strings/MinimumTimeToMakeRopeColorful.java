package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 27/12/23,Wednesday

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumTimeToMakeRopeColorful {

    public static void main(String[] args)
    {
        System.out.println(max("cbzxy"));
    }

    public static int max(String s)
    {
        var map = new HashMap<Character , ArrayList<Integer>>();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            if(map.containsKey(item))
            {
                var idx = map.get(item);
                idx.add(i);

                map.put(item , idx);
            }
            else
            {
                var idx = new ArrayList<Integer>();
                idx.add(i);

                map.put(item , idx);
            }
        }

        int max = -1;

        for(var ch : map.keySet())
        {
            if(map.get(ch).size() > 1)
            {
                max = Math.max(max , map.get(ch).get(map.get(ch).size()-1) - map.get(ch).get(0)-1);
            }
        }

        return max ;
    }
}
