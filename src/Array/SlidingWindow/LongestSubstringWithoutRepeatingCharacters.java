package Array.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args)
    {
        System.out.println(longestSubstring("aabaab!bb"));
    }

    public static int longestSubstring(String s)
    {
        Set<Character> set = new HashSet<>();
        int start = 0, ans = 0;

        for(int i = 0 ; i < s.length() ; i ++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(i));
            ans = Math.max(ans , set.size());
        }

        return ans;
    }
}
