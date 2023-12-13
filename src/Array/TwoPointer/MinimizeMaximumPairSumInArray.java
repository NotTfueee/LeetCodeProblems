package Array.TwoPointer;

//File Created by -- > anuragbhatt
//Created On -- > 17/11/23,Friday

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {

    public static void main(String[] args) {

        int[] arr = {2 , 3, 4 , 4, 6 , 8 , 1 , 3};
        System.out.println(minPairSum(arr));
    }

    public static int minPairSum(int[] nums)
    {

        Arrays.sort(nums);

        int left = 0 , right = nums.length-1 , max = Integer.MIN_VALUE;

        while(left < right)
        {
            max = Math.max(nums[left] + nums[right]  , max);
            left ++;
            right --;
        }

        return max;
    }
}
