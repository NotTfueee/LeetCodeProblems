package Array;

//File Created by -- > anuragbhatt
//Created On -- > 15/11/23,Wednesday

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearranging {

    public static void main(String[] args) {

        int[] arr = {100,1,1000};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr)
    {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;

        Arrays.sort(arr);

        arr[0] = 1;

        for(int i = 1 ; i < arr.length ; ++i)
        {
            if((int)Math.abs(arr[i] - arr[i-1]) > 1)
            {
                int diff = arr[i] - arr[i-1] -1;
                arr[i] = arr[i] - diff;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];
    }
}
