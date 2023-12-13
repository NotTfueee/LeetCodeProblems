package Hash_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args)
    {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagram(s));
    }

    public static List<List<String>> anagram(String[] strs)
    {
        HashMap<String , List<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i ++)
        {
            String item = strs[i];

            String sortedItem = sorter(item);

            if(!map.containsKey(sortedItem))
            {
                map.put(sortedItem , new ArrayList<>(Arrays.asList(item)));
            }
            else
            {
                List<String> val = map.get(sortedItem);
                val.add(item);
                map.put(sortedItem , val);
            }

        }

        return new ArrayList<>(map.values());
    }

    public static String sorter(String s)
    {
        String[] arr = s.split("");
        Arrays.sort(arr);
        String ans = String.join("",arr);
        return ans;
    }
}
