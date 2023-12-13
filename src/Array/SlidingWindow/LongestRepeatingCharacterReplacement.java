package Array.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args)
    {
        System.out.println(longest("ABAA", 1));
    }

    public static int longest(String s , int k )
    {
        /*
        i want to create a map so that i can store the frequencies of the characters present within a window
        meaning that if the window is of size 4 then what is the frequency of the chars present in that window
         */
        HashMap<Character , Integer> map = new HashMap<>();
        int ans = 0 , max = 0 , start = 0;

        /*
        now i know for a window to be valid the window size and the difference of the most occuring char should be less than
        or equal to k so that we can replace the chars that many times and that would be our valid window
        and if this is not possible that the window size and the most frequent chars frequency is greater than k
        this means we cannot obtain a substring of all the same characters in the given window
         */

        for(int i = 0 ; i < s.length() ; i ++)
        {
            char item = s.charAt(i);
            map.put(item , map.getOrDefault(item , 0)+1);

            /*
                instead of checking the map each time for the max repeating char
                (NOTE*****- the map will only hold the chars currently present in the window )
                so we need to check the maximum occurring char among the window and the difference in the window size and
                 max char will give us the remaining char that must be less than k to be replaced
             */
            max = Math.max(max , map.get(item));

            if((i-start+1) - max > k)
            {
                char left = s.charAt(start);

                if(map.get(left) == 1)map.remove(left);
                else map.put(left , map.get(left)-1);

                start++;
            }

            ans = Math.max(ans , i-start+1);
        }

        return ans;
    }
}
