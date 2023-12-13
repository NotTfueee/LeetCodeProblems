package Array;

//File Created by -- > anuragbhatt
//Created On -- > 03/10/23,Tuesday

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1,1,3};
        System.out.println(goodPair(nums));

    }

    public static int goodPair(int[] nums)
    {
        Map<Integer, Integer> frequency = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            pairs += frequency.getOrDefault(num, 0);
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        return pairs;
    }
}
