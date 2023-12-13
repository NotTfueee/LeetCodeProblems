package Array;

//File Created by -- > anuragbhatt
//Created On -- > 25/11/23,Saturday

import java.util.Arrays;

public class SumOfAbsoluteDifferencesInASortedArray {

    public static void main(String[] args) {

        int[] arr = {1,4,6,8,10};

        System.out.println(Arrays.toString(getSumAbsoluteDifference(arr)));
    }

    public static int[] getSumAbsoluteDifference(int[] arr )
    {
        int[] pre = new int[arr.length];
        int[] post = new int[arr.length];

        int sum = arr[0];

        for(int i = 1 ; i < arr.length ; ++i)
        {
            pre[i] = sum;
            sum += arr[i];
        }

        sum = arr[arr.length - 1];

        for(int i = arr.length - 2 ; i >= 0 ; --i)
        {
            post[i] = sum ;
            sum += arr[i];
        }

        int [] ans = new int[arr.length];

        for(int i = 0 ; i < arr.length ; ++i)
        {
            int num = arr[i];
            int preCalculated = num * i - pre[i] , postCalculated = post[i] - (num * (arr.length-1 - i));

            ans[i] = preCalculated + postCalculated;
        }

        return ans;
    }

}
