package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 28/10/23,Saturday

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(longest("abbbbb"));

    }

    public static int longest(String s) {
        int start = 0, ans = 0;

        var set = new HashSet<Character>();

        for (int i = 0; i < s.length(); ++i) {
            char item = s.charAt(i);

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(item);
            ans = Math.max(ans, set.size());

        }

        return ans;
    }

}
