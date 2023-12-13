package Array;

//File Created by -- > anuragbhatt
//Created On -- > 23/11/23,Thursday

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarray {

    public static void main(String[] args) {

        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2} ;
        int[] r = {2,3,5};

        System.out.println(checkArithmetic(nums , l , r));
    }

    public static List<Boolean> checkArithmetic(int[] nums , int[]l , int[] r)
    {
        var ans = new ArrayList<Boolean>();

        for(int i = 0 ; i < l.length ; ++i)
        {
            int left = l[i] , right = r[i];
            int[] arr = new int[right - left + 1];

            int  k= 0;
            for(int j = left ; j <= right ; ++j)
            {
                arr[k] = nums[j];
                k++;
            }

            Arrays.sort(arr);

            int diff = arr[1] - arr[0] , flag = 0;

            for(int j = arr.length-1 ; j >= 1 ; --j)
            {
                if(arr[j] - arr[j-1] != diff)
                {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1)ans.add(false);
            else ans.add(true);
        }

        return ans;
    }

}
