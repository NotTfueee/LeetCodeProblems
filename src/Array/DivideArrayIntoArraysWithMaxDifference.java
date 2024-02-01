package Array;

//File Created by -- > anuragbhatt
//Created On -- > 01/02/24,Thursday

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {

    public static void main(String[] args) {

        int[]num = {1,3,3,2,7,3};
        System.out.println(Arrays.deepToString(divideArray(num, 3)));

    }

    public static int[][] divideArray(int[] nums , int k)
    {
        if(nums.length % 3 != 0)return new int[][]{};

        Arrays.sort(nums);
        int n = nums.length / 3;

        int l = 0 ;

        int[][] ans = new int[n][3];

        for(int i = 0 ; i < n && l < nums.length ; ++i)
        {
            for(int j = 0 ; j < 3 ; ++j)
            {
                ans[i][j] = nums[l];
                l++;
            }
        }

        for(int i = 0 ; i < n ; ++i)
        {
            if(ans[i][2] - ans[i][0] > k)return new int[][]{};
        }

        return ans;
    }
}
