package BitManipulation;

import java.util.Arrays;

public class SortIntegersbyTheNumberof1Bits {

    public static void main (String [] args)
    {
        int [] a = {0,1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(sortByBits(a)));
    }

    public static int[] sortByBits(int[] arr)
    {
        int len = arr.length ;
        int[] ans = new int[len];

        for( int i = 0 ; i < len ; i ++)
        {
            int temp = arr[i] , count = 0 ;

            while( temp > 0)
            {
                if((temp & 1 )> 0)count++;
                temp >>= 1;
            }

        }
        return ans;
    }
}
