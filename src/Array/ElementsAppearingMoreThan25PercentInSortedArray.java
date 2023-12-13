package Array;

//File Created by -- > anuragbhatt
//Created On -- > 11/12/23,Monday

public class ElementsAppearingMoreThan25PercentInSortedArray {

    public static void main(String[] args) {
        int[] arr = {15,15,21,21,32,32,33,33,33,34,35};
        System.out.println(findSpecialInteger(arr));

    }

    public static int findSpecialInteger(int[] arr )
    {
        int currCount = 1 , currMax = Integer.MIN_VALUE , prev = arr[0] , ans = 0;

        for(int i = 1 ; i < arr.length ; ++i)
        {
            if(arr[i] == prev)currCount++;
            else
            {
                prev = arr[i];
                currCount = 1;
            }

            if(currCount > currMax)
            {
                currMax = currCount;
                ans = arr[i];
            }
        }

        return ans;
    }
}
