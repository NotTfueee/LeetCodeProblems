package Array.SlidingWindow;

import java.util.HashMap;

public class PermutationInString {

    public static void main(String[] args)
    {
        System.out.println(check("ab" , "eidboaoo"));
    }

    public static boolean check(String s1 , String s2)
    {
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i ++)
        {
            char item = s1.charAt(i);
            map1.put(item , map1.getOrDefault(item , 0)+1);
        }

        int k = s1.length() , start = 0;

        for(int i = 0 ; i < s2.length() ; i ++)
        {
            char item = s2.charAt(i);
            map2.put(item , map2.getOrDefault(item , 0)+1);

            if(i-start == k-1)
            {
                if(map2.equals(map1))return true;
                char last = s2.charAt(start);

                if(map2.get(last) == 1)map2.remove(last);
                else map2.put(last , map2.get(last) - 1);
                start ++;
            }
        }
        return false;
    }
}
