package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 13/01/24,Saturday

import java.util.HashMap;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public static void main(String[] args) {

        System.out.println(minSteps("bab" , "aab"));
    }

    public static int minSteps(String s , String t)
    {
        var map1 = new HashMap<Character , Integer>();
        var map2 = new HashMap<Character , Integer>();

        for(int i = 0 ; i < s.length() ; ++i)
            map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i) , 0) + 1);

        for(int i = 0 ; i < t.length() ; ++i)
            map2.put(t.charAt(i) , map2.getOrDefault(t.charAt(i) , 0) + 1);


        int count = 0 ;

        for(char c : map2.keySet())
        {
            if(map1.containsKey(c))
            {
                int val1 = map1.get(c);
                int val2 = map2.get(c);

                if(val1 < val2) count += val2-val1;
            }
            else count += map2.get(c);
        }

        return count;
    }
}
