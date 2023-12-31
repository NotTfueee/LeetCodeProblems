package Array.PrefixSuffixSum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args)
    {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(product(a)));
    }

    public static int[] product(int[] nums)
    {
        int[] ans = new int[nums.length];
        ans[0] = 1;

        /*
         we find the prefix multiplication of nums array and store it in ans array at one index more than the current
         nums index as the current prefix mul excluding the current element will be its prefix mul that is why
         and also find the suffix sum which will be the suffix mul except the current num so we store it in one index less
         */
        for(int i = 1 ; i < nums.length ; i++)
        {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int rightMul = 1;
        for(int i = nums.length-1 ; i>=1 ; i--)
        {
            rightMul = rightMul*nums[i];
            ans[i-1] = rightMul * ans[i-1];
        }

        return ans;
    }
}
