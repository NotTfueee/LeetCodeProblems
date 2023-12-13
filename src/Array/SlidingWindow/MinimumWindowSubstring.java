package Array.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void main(String [] args)
    {
        System.out.println(window("whoopiepiesmakemyscalegroan" , "roam"));
    }

    public static String window(String s , String t)
    {
        if(t.length() > s.length())return "";

        int left = 0 , right = 0 , desiredMatchCount = t.length() , foundMatchCount = 0 , minString = Integer.MAX_VALUE;
        int minStart = 0 , maxEnd = 0;

        String ans = "";

        var mapT = new HashMap<Character , Integer>();
        var mapS = new HashMap<Character , Integer>();

        for(int i = 0 ; i < t.length() ; i ++)
        {
            char item = t.charAt(i);
            mapT.put(item , mapT.getOrDefault(item , 0)+1);
        }

        while(right < s.length())
        {
            char item = s.charAt(right);

            if(mapT.containsKey(item))
            {
                if(mapS.get(item) == null || mapS.get(item) < mapT.get(item))
                {
                    foundMatchCount++;
                    mapS.put(item , mapS.getOrDefault(item , 0 ) +1);
                }
                else mapS.put(item , mapS.getOrDefault(item , 0 ) +1);
            }

            if(foundMatchCount == desiredMatchCount)
            {

                while(foundMatchCount == desiredMatchCount)
                {

                    if(right - left + 1 < minString)
                    {
                        minStart = left;
                        maxEnd = right+1;
                        minString = right-left+1;
                    }

                    char release = s.charAt(left);

                    if(mapS.containsKey(release))
                    {
                        int value = mapS.get(release);

                        if(value <= mapT.get(release))
                        {
                            foundMatchCount--;
                        }

                        if(value > 1)
                        {
                            value --;
                            mapS.put(release , value);
                        }
                        else mapS.remove(release);
                    }

                    left++;
                }
            }
            right++;
        }

        return (s.substring(minStart , maxEnd));
    }
}
