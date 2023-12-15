package Graphs;

//File Created by -- > anuragbhatt
//Created On -- > 15/12/23,Friday

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DestinationCity {

    public static void main(String[] args) {


    }

    public static String destCity (List<List<String>>paths)
    {
        var map = new HashMap<String , ArrayList<String>>();

        for (List<String> edge : paths)
        {
            String source = edge.get(0);
            String neighbour = edge.get(1);

            if (map.containsKey(source)) {
                var neighbours = map.get(source);
                neighbours.add(neighbour);
                map.put(source, neighbours);
            } else {
                var neighbours = new ArrayList<String>();
                neighbours.add(neighbour);
                map.put(source, neighbours);
            }
        }

        String ans = paths.get(0).get(0);


        /*
         keep on getting the ans string until it is present in the map as soon as the string is not present in the map means we
        have a city that does not have any outgoing edge
         */
        while(map.containsKey(ans))
        {
            var n = map.get(ans);

            for(String s : n)
            {
                ans = s;
            }
        }

        return ans;
    }
}
