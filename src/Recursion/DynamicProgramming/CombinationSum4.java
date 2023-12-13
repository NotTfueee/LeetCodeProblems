package Recursion.DynamicProgramming;

import java.util.Arrays;

public class CombinationSum4 {

    public static void main(String[] args)
    {
        int[] a = {1,2,3};
        System.out.println(findPer(a , 4));
    }

    public static int findPer(int[] nums , int target)
    {
        int [] hack = new int[target+1];
        hack[0] = 1;

        for(int i = 1; i <= target ; i ++)
        {
            int sum = 0 ;

            for(int j = 0  ; j < nums.length ; j ++)
            {
                if( i >= nums[j])
                {
                    sum += hack[i-nums[j]];
                }
            }

            hack[i] = sum;
        }

        System.out.println(Arrays.toString(hack));

        return hack[target];
    }
}
