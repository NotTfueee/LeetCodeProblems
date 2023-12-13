package BitManipulation;

public class SumOfTwoIntegers {

    public static void main(String[] args)
    {
        System.out.println(summer(2,3));
    }

    public static int summer(int a , int b)
    {

        /*
        we first want to xor the two numbers which will give us only the bits that were different
        this xor operation handles the addition but without the carry as we know how bit addition occurs
        to handle the carry of same on bits we need to perform an and operation among a & b which will give us the
        position and the bits that were on and as we know that when a carry is generated it is shifted to the left bits
        for evaluation
        so we perform the same operation on the bits and do this again till the carry becomes 0
         */

        while(b != 0 )
        {
            // im declaring a temp variable here because in the next iteration
            int temp = (a & b)<< 1;
            a = a ^ b ;
            b = temp;
        }

        return a;
    }
}
