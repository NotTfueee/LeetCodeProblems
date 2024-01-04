package Array;

//File Created by -- > anuragbhatt
//Created On -- > 04/01/24,Thursday

import java.util.HashMap;

public class MinimumNumberOfOperationsToMakeAnArrayEmpty {

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums)
    {
        var map = new HashMap<Integer , Integer>();

        for(int i : nums)
        {
            map.put(i , map.getOrDefault(i , 0 ) + 1);
        }

        int count = 0;

        for(int i : map.keySet())
        {
           int val = map.get(i);

           if(val < 2)return -1;


           if(val % 3 == 0)count += (val / 3);
           else
           {
               int last = val / 3 - 1;

               count += last;

               val = val - (last * 3);

               count += (val / 2);
           }
        }

        return count;
    }
}
