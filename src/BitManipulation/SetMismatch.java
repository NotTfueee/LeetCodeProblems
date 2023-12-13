package BitManipulation;

import java.util.Arrays;

public class SetMismatch {

    public static void main (String [] args)
    {
        int[] a = {1,2,2,4};
        String ans = Arrays.toString(findError(a));

        System.out.println(ans);
    }

    public static int[] findError(int[] nums)
    {
        int [] out = new int[2];

        int sumOfAp = (nums.length *(nums.length+1))/2;
        System.out.println(sumOfAp);

        int sumOfArray = Arrays.stream(nums).sum();
        System.out.println(sumOfArray);

        int missingNumber = sumOfAp - sumOfArray;

        out[1] = missingNumber;

        return out;
    }
}
