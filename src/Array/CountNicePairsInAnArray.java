package Array;

//File Created by -- > anuragbhatt
//Created On -- > 21/11/23,Tuesday

import java.util.HashMap;

public class CountNicePairsInAnArray {

    public static void main(String[] args) {

        int[] nums = {13,10,35,24,76};

        System.out.println(countNicePairs(nums));
    }

    public static int countNicePairs(int[] nums)
    {
        int n = nums.length  , mod = (int) 1e9+7;
        int[] rev = new int[n];

        for(int i = 0 ; i < n ; ++i)
        {
            int num = nums[i] , revNum = 0;

            while(num > 0)
            {
                int digit = num % 10;
                num /= 10;
                revNum = revNum * 10 + digit;
            }

            rev[i] = nums[i] - revNum;
        }

        var map = new HashMap<Integer, Integer>();

        for(int val : rev)
        {
            map.put(val , map.getOrDefault(val , 0 ) + 1);
        }

        long count = 0 ;

        for(int val : map.keySet())
        {
            int c = map.get(val);
            count = (count +(long)c * (c -1)/2) % mod ;
        }

        return (int)count;
    }
}
