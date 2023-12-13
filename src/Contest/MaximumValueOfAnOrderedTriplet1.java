package Contest;

//File Created by -- > anuragbhatt
//Created On -- > 01/10/23,Sunday

public class MaximumValueOfAnOrderedTriplet1 {

    public static void main(String[] args) {

        int[] arr = {1000000,1,1000000};
        System.out.println(maxVal(arr));

    }

    public static long maxVal(int[] nums)
    {
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; ++i)
        {
            for(int j = i+1 ; j < nums.length ; ++j)
            {
                for(int k = j + 1 ; k < nums.length ; ++k)
                {
                    long first = nums[i] , second = nums[j] , third = nums[k];

                    max = Math.max(max , (first-second)*third);
                }
            }
        }

        return max > 0 ? max : 0;
    }
}
