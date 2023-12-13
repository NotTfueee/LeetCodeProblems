package BitManipulation;

import java.util.Arrays;

public class CountingBits {

    public static void main (String [] args)
    {
        String a = Arrays.toString(bitChecker(5));

        System.out.println(a);
    }

    public static int[] bitChecker(int n)
    {
        int [] arr = new int[n+1];

        System.out.println(arr.length);

        for( int i = 0 ; i < arr.length ; i ++)
        {
            if(i == 0 )arr[i] = 0 ;
            else
            {
                n = i;
                int count = 0;
                while( n != 0 )
                {
                    int rmsb = n & (-n);
                    n = n - rmsb;
                    count++;
                }

                arr[i] = count;
            }
        }

        return arr;
    }


}
