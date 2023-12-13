package Recursion.DynamicProgramming;

public class JumpGame2 {

    public static void main (String[] args)
    {
        int[] a = {2,3,1,1,4};
        System.out.println(jump(a));
    }

    public static long jump(int[] stairs)
    {
        int n = stairs.length ;

        if(n == 1)return 0;

        int[] memo = new int[n];
        memo[n-1] = 0;

        for(int i = n - 2 ; i >= 0 ; i --)
        {
            if(stairs[i] > 0 )
            {
                int min = Integer.MAX_VALUE;
                for(int j = 1 ; j <= stairs[i] && i+j < n ; j++)
                {
                    if(memo[i+j] > 0 || i+j == n-1)
                        min = Math.min(memo[i+j] , min);
                }

                memo[i] = min + 1;
            }
        }

        return memo[0];
    }
}
