package Recursion.DynamicProgramming;

public class MaximumNumberOfJumpsToReachTheLastIndex {

    public static void main (String [] args)
    {
        int[] a = {0,1};
        System.out.println(maxJumps(a , 1));
    }

    public static int maxJumps(int[] stairs , int target)
    {
        int n = stairs.length;
        int[] memo = new int[n];
        memo[n-1] = 0 ;

        for(int i = n-2 ; i >= 0 ; i --)
        {
            if(stairs[i] > 0 )
            {
                int max = Integer.MIN_VALUE;

                for(int j = 1 ; j <= stairs[i] && i + j < n ; j ++)
                {
                    if(memo[i+j] > 0 || i + j == n - 1)
                    {
                        int valid = stairs[j+i] - stairs[i];

                        if((-target <= valid) && (valid <= target ))
                        {
                            max = Math.max(memo[i+j] , max);
                        }
                    }
                }

                memo[i] = max+1;
            }
        }

      return memo[0] > 0 ? memo[0] : -1;
    }
}
