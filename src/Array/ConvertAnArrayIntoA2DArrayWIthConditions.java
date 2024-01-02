package Array;

//File Created by -- > anuragbhatt
//Created On -- > 02/01/24,Tuesday

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWIthConditions {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(findMatrix(arr));
    }

    public static List<List<Integer>> findMatrix(int[] nums)
    {
        var ans = new ArrayList<List<Integer>>();
        var map = new HashMap<Integer , Integer>();

        for(int i : nums)
        {
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(int i : map.keySet())
        {
            max = Math.max(max , map.get(i));
        }

        while(max -- > 0)
        {
            var arr = new ArrayList<Integer>();

            for(int i : map.keySet())
            {
                int val = map.get(i);

                if(val > 0)arr.add(i);

                if(val > 1)
                {
                    val -- ;
                    map.put(i , val);
                }
                else map.put(i , 0);
            }

            ans.add(arr);
        }
        return ans;
    }
}
