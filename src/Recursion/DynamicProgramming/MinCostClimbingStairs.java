package Recursion.DynamicProgramming;

import java.util.Arrays;

public class MinCostClimbingStairs {

    public static void main(String[] args)
    {
        int[] a = {10,15,20};
        System.out.println(minCost(a));
    }

    public static int minCost(int[] stairs)
    {
        int n = stairs.length;
        if(n == 1 )return stairs[0];
        else if (n == 2)return Math.min(stairs[0], stairs[1]);

        int[] memo = new int[n];
        memo[n-1] = stairs[n-1];
        memo[n-2] = stairs[n-2];

        for(int i = n-3 ; i >= 0 ; i --)
        {
            int min = Integer.MAX_VALUE;

            for(int j = 1 ; j <= 2 && i + j < n ; j ++)
            {
                min = Math.min(memo[i+j] , min );
            }

            memo[i] = min + stairs[i];
        }
        System.out.println(Arrays.toString(memo));
        return Math.min(memo[0], memo[1]);
    }


}
