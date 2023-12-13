package Hash_Maps;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] a = {100,4,200,1,3,2};
        System.out.println(longest(a));

    }

    public static int longest(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0 , max = 0;

        for(int j = 0 ; j < nums.length ; j++)
        {
            set.add(nums[j]);
        }

        System.out.println(set);

        for (int i = 0; i < nums.length; i++)
        {
            int item = nums[i];

            if(!set.contains(item-1))
            {
                while(set.contains(item))
                {
                    count++;
                    item++;
                }

                max = Math.max(max , count);
                count = 0;
            }

        }
        return max;
    }
}
