package BitManipulation;

public class HammingDistance {

    public static void main(String [] args)
    {
        /* hamming distance between the bits is considered as no of distinct bits between the two given numbers
            so all we need to do is find the xor of the two numbers and then count the no of turned on bits in the
            number.
         */

        System.out.println(hamms(5,7));

    }

    public static int hamms(int x , int y )
    {

        int count = 0;

        // to find the number of distinct bits we xored the number
        int xoredNumber = x ^ y ;

        // to count the number of on bits of a number we use kernighans algo

        while(xoredNumber != 0 )
        {
            // to find the rmsb we and the number with its two's complement
            int rightMostSetBit = xoredNumber & (-xoredNumber);

            xoredNumber -= rightMostSetBit;
            count++;
        }

        return count;
    }
}
