package Recursion.DynamicProgramming;

//File Created by -- > anuragbhatt
//Created On -- > 26/12/23,Tuesday

import java.util.Arrays;

public class NumberOfDiceRollWithTargetSum {

    public static void main(String[] args) {

        System.out.println(numRollsToTarget(4 , 5, 10));
    }

    public static int numRollsToTarget(int n , int k , int target)
    {
        int mod = (int) 1e9+7;

        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;

        for(int val = 1 ; val <= k ; ++val)
        {
            dp[1][val] = 1;
        }

        for(int dice = 2 ; dice < n+1 ; ++dice)
        {
            for(int face = dice ; face < target+1 ; ++face)
            {
                int sum = 0 ;
                for(int i = 0 ; i < face ; ++i)
                {
                    sum = (sum % mod + dp[dice-1][i] % mod)%mod;
                }
                dp[dice][face] = sum % mod;
            }
        }

        for(int i = 0 ; i < n + 1 ; ++i)
        {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[n][target];
    }
}
