package BitManipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumberIII {

    public static void main(String[] args)
    {
        int[] a = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(a)));
    }

    public static int[] singleNumber(int[] arr)
    {
        int[] out = new int[2];

        int uniqueNums = 0;

        /*
        the xor of all the numbers in the array will give me the remaining numbers that do not repeat 2 times as all
        repeating numbers would have been cancelled with each other
         */
        for(int i = 0 ; i < arr.length ; i++)
        {
            uniqueNums ^= arr[i];
        }

        /*
            not we know that the xor of those two number would have given us a binary number such as 0110 we can imply from
            this that the places were we have on bit states that both the numbers did not have on bit at that place
            meaning that if it would have been 1010 and 0010 the xor of this would have been 1000 and the same bit would have
            been cancelled
            using this we will seprate the numbers from the array in two parts the numbers which have the right most set bit
            (means the first place where the bit is set to 1 ) and the numbers which do not have the right most set bit set to 0 at
            that place
            to do this we will create a mask and to create a right most set bit mask we and the 2's complement of the number
            here the number is the xor of the whole array which is also the xor of the two unqiue numbers
         */

        int rmsbMask = uniqueNums & (-uniqueNums);

        int numWithO = 0;
        int numWith1 = 0;

        for(int i = 0 ; i < arr.length; i ++)
        {
            int item = arr[i];

            if((item & rmsbMask)== 0)
            {
                numWithO = numWithO ^ item;
            }
            else
            {
                numWith1 = numWith1 ^ item;
            }
        }

        out[0] = numWithO;
        out[1] = numWith1;

        return out;
    }
}
