package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 15/01/24,Monday

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {

    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};

        System.out.println(findWinners(arr));
    }

    public static List<List<Integer>> findWinners(int[][] matches)
    {

        var losers = new HashMap<Integer , Integer>();
        var winners = new HashSet<Integer>();

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < matches.length ; ++i)
        {
            winners.add(matches[i][0]);
        }

        for(int i = 0 ; i < matches.length ; ++i)
        {
            int item = matches[i][1];
            losers.put(item , losers.getOrDefault(item , 0 ) + 1);
        }

        var l = new ArrayList<Integer>();

        for(int i : losers.keySet())
        {
            winners.remove(i);

            int val = losers.get(i);
            if(val == 1)l.add(i);
        }

        var w = new ArrayList<Integer>(winners);

        Collections.sort(w);
        Collections.sort(l);
        ans.add(w);
        ans.add(l);
        return ans;
    }
}
