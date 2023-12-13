package Array.TwoPointer;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args)
    {
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(sum(a));
    }

    public static List<List<Integer>> sum (int[] nums)
    {

        Set<List<Integer>> result = new HashSet<>();

        // to apply the 2 sum approach more effectively (n log n )
        Arrays.sort(nums);

        // as i need 2 more elements to check if the element has a counter part to make the sum as zero or not
        for(int i = 0 ; i < nums.length-2 ; i ++)
        {
            int fix = nums[i];
            if(fix > 0 )break;

            int left = i+1 , right = nums.length-1;

            while(left < right)
            {
                if(nums[left] + nums[right] == -(fix))
                {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    result.add(triplets);
                    right--;
                    left++;
                }
                else if(nums[left] + nums[right] > -(fix))
                {
                    right --;
                }
                else
                {
                    left++;
                }
            }

        }

        return new ArrayList(result);
    }
}
