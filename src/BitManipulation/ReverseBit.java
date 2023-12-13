package BitManipulation;

public class ReverseBit {

    public static void main(String [] args)
    {
        System.out.println(reverseBit(0100));
    }

    public static int reverseBit(int n )
    {
        int result = 0;

        for(int i = 0 ; i < 32 ; i ++)
        {
            int rightMostBit = n & 1;
            int reverse = rightMostBit << (31-i);
            result = reverse | result;
            n = n >> 1;
        }

        return result;
    }
}
