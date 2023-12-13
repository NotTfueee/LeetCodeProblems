package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 05/10/23,Thursday

import java.util.HashMap;

public class RomanAndInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s)
    {

        var map = new HashMap<Character , Integer >();

        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int sum = 0 , prev = 0 ;

        for(int i = s.length() - 1 ; i >= 0 ; --i)
        {
            int item = map.get(s.charAt(i));

            if(item < prev)
            {
                sum -= item;
            }
            else
            {
                sum += item;
            }

            prev = item;
        }

        return sum;
    }
}
