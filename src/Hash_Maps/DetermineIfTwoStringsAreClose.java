package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 14/01/24,Sunday

import java.util.HashMap;
import java.util.HashSet;

public class DetermineIfTwoStringsAreClose {

    public static void main(String[] args) {

        System.out.println(closeStrings("uau" , "ssx"));

    }

    public static boolean closeStrings(String word1 , String word2)
    {

        if(word1.length() != word2.length())return false;

        var mapWord1 = new HashMap<Character , Integer>();
        var mapWord2 = new HashMap<Character , Integer>();
        var charSet = new HashSet<Character>();

        for(int i = 0 ; i < word1.length() ; ++i)
        {
            char item = word1.charAt(i);
            mapWord1.put(item , mapWord1.getOrDefault(item , 0 ) + 1);
            charSet.add(item);
        }

        for(int i = 0 ; i < word2.length() ; ++i)
        {
            char item = word2.charAt(i);
            mapWord2.put(item , mapWord2.getOrDefault(item , 0 ) + 1) ;
            if(!charSet.contains(item))return false;
        }


        if(mapWord1.equals(mapWord2))return true;

        var valueOfMap2 = new HashMap<Integer , Integer>();
        var valueOfMap1 = new HashMap<Integer , Integer>();

        for(char c : mapWord2.keySet())
        {
            int val = mapWord2.get(c);
            valueOfMap2.put(val , valueOfMap2.getOrDefault(val , 0 ) + 1);
        }

        for(char c : mapWord1.keySet())
        {
            int val = mapWord1.get(c);
            valueOfMap1.put(val , valueOfMap1.getOrDefault(val , 0 ) + 1);
        }

        return valueOfMap2.equals(valueOfMap1);
    }
}
