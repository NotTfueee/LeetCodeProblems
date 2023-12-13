package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 12/09/23,Tuesday

import java.util.HashMap;
import java.util.HashSet;

public class MinimumDeletionToMakeCharactersFrequenciesUnique {

    public static void main(String[] args)
    {
        System.out.println(minDel("bbcebab"));
    }

    public static int minDel(String s )
    {
        var map = new HashMap<Character , Integer>();

        for(int i = 0 ; i< s.length(); i ++)
        {
            char item = s.charAt(i);
            map.put(item , map.getOrDefault(item , 0)+1);
        }

        var set = new HashSet<Integer>();
        int count = 0;

        for(int val : map.values())
        {
            if(!set.contains(val))set.add(val);
            else
            {
                while(set.contains(val))
                {
                    count++;
                    val--;
                }

                if(val >0)set.add(val);
            }
        }

        return count;
    }
}
