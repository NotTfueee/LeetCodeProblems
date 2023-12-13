package Array.TwoPointer;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {

    public static void main(String[] args)
    {
        int[] a = {2,7,11,15};
        System.out.println(Arrays.toString(sum(a , 9)));
    }

    public static int[] sum(int[] nums , int target)
    {
        int left = 0 , right = nums.length-1;
        int[] ans = new int[2];

        while(left < right)
        {
            if(nums[left] + nums[right] == target)
            {
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
            else if(nums[left] + nums[right] > target)right--;
            else left++;
        }

        return ans;
    }
}
