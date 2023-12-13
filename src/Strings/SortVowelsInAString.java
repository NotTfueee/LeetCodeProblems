package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 13/11/23,Monday

import java.util.*;

public class SortVowelsInAString {

    public static void main(String[] args) {

        System.out.println(vowels("lYmpH"));

    }

    public static String vowels(String s)
    {
        var set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        var arr = new ArrayList<Character>();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            if(set.contains(item))arr.add(item);
        }

        Collections.sort(arr);

        System.out.println(arr);

        StringBuilder ans = new StringBuilder(s.length());
        int j = 0 ;

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            if(set.contains(item))
            {
                ans.append(arr.get(j));
                j++;
            }
            else  ans.append(item);
        }

        return ans.toString();
    }
}
