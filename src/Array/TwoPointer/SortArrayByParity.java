package Array.TwoPointer;

//File Created by -- > anuragbhatt
//Created On -- > 28/09/23,Thursday

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {

        int[] arr = {3,1,2,4};

        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] nums)
    {
        if(nums.length == 1)return nums;

        int n = nums.length , left = 0 , right = n - 1;
        int[] ans = new int[n];

        for(int i = 0 ; i < n ; ++i)
        {
            int item = nums[i];

            if(item % 2 == 0 )
            {
                ans[left] = item;
                left++;
            }
            else
            {
                ans[right] = item;
                right--;
            }
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }
}
