package Hash_Maps;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main (String[] args)
    {
        System.out.println(valid("anagram" , "nagaram"));
    }

    public static boolean valid(String s , String t)
    {
        if(s.length() != t.length())return false;

        Map<Character , Integer> mapS = new HashMap<>();
        Map<Character , Integer> mapT = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i ++)
        {
            char item = s.charAt(i);
            mapS.put(item , mapS.getOrDefault(item , 0)+1);
        }

        for(int j = 0 ; j < t.length() ; j++)
        {
            char item = t.charAt(j);
            mapT.put(item , mapT.getOrDefault(item , 0)+1);
        }

        return mapS.equals(mapT);
    }
}
