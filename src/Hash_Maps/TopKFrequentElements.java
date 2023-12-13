package Hash_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args)
    {
        int[] a = {1,-1,-2,1,-2,3};
        System.out.println(Arrays.toString(kfreq(a,2)));
    }

    public static int[] kfreq(int[] nums , int k )
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            int item = nums[i];
            map.put(item , map.getOrDefault(item , 0 )+1);
        }


        int[] freq = new int[nums.length];
        return nums;
    }
}
