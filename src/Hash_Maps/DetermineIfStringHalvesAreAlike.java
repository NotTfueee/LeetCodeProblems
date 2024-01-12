package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 12/01/24,Friday

import java.util.HashSet;

public class DetermineIfStringHalvesAreAlike {

    public static void main(String[] args) {

        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s)
    {
        var set = new HashSet<Character>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');

        int count1 = 0 , count2 = 0 ;

        for(int i = 0 ; i < s.length(); ++i)
        {
            char item = s.charAt(i);
            if(i < s.length()/2)
            {
                if(set.contains(item))count1++;
            }
            else
            {
                if(set.contains(item))count2++;
            }
        }

        return count1 == count2;
    }
}
