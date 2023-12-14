package Array;

//File Created by -- > anuragbhatt
//Created On -- > 14/12/23,Thursday

import java.util.Arrays;

public class ProductArrayPuzzle {

    public static void main(String[] args) {
        int [] arr = {10, 3, 5, 6, 2};

        System.out.println(Arrays.toString(productExceptSelf(arr, arr.length)));
    }

    public static long[] productExceptSelf(int[] nums , int n)
    {
        long[] preSuff = new long[n];

        long p = 1;

        for(int i = 0 ; i < n ; ++i)
        {
            preSuff[i] = p ;
            p *= nums[i];
        }

        p = 1;

        for(int i = n -1 ; i >= 0 ; --i)
        {
            preSuff[i] *= p;
            p *= nums[i];
        }

        return preSuff;
    }
}
