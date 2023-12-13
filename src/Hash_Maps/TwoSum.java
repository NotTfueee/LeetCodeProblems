package Hash_Maps;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{

    public static void main(String[] args)
    {
        int[] a = {3,3};
        System.out.println(Arrays.toString(sum(a, 6)));
    }

    public static int[] sum(int[]nums , int target)
    {
        HashMap<Integer , Integer> map = new HashMap<>();

        int[] ans = new int[2];

        for(int i = 0 ; i < nums.length ; i ++)
        {
            int item = nums[i];

            if(map.containsKey(target-item))
            {
                ans[0] = i;
                ans[1] = map.get(target-item);
            }
            else
            {
                map.put(item , i);
            }
        }

        return ans;
    }
}
