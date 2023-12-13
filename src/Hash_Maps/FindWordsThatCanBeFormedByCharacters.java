package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 02/12/23,Saturday

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {
        String [] words = {"cat" , "bt", "hat" , "tree"};

        System.out.println(countCharacters(words , "atach"));
    }

    public static int countCharacters(String[] words , String chars)
    {
        var mapChars = new HashMap<Character , Integer>();

        for(int i = 0 ; i < chars.length() ; ++i)
        {
            char item = chars.charAt(i);
            mapChars.put(item , mapChars.getOrDefault(item , 0 ) + 1);
        }

        int count = 0 ;

        for(int i = 0 ; i < words.length ; ++i)
        {
            String word = words[i];
            boolean isComplete = true;

            var clone = new HashMap<>(mapChars);

            for(int j = 0 ; j < word.length() ; ++j)
            {
                char item = word.charAt(j);
                if(clone.containsKey(item))
                {
                    int val = clone.get(item);

                    if(val > 1)
                    {
                        val -- ;
                        clone.put(item , val);
                    }
                    else clone.remove(item);
                }
                else
                {
                    isComplete = false;
                    break;
                }

            }
            if(isComplete)count += word.length();
        }
        return count;
    }
}
