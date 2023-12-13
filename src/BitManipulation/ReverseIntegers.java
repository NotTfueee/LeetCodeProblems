package BitManipulation;

public class ReverseIntegers {

    public static void main(String [] args)
    {
        System.out.println(reverse(-123));
    }

    public static int reverse(int n )
    {
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE , ans = 0;

        while(n != 0 )
        {
            int digit = n % 10;
            n = n / 10;

            int maxIntegerExceptLastDigit = max/10;
            int minIntegerExceptLastDigit = min/10;

            if( ans > maxIntegerExceptLastDigit || (ans == maxIntegerExceptLastDigit && digit >= max%10))return 0;

            if(ans < minIntegerExceptLastDigit || (ans == minIntegerExceptLastDigit && digit <= min%10 ))return 0;

            ans = (ans * 10 )+digit;

        }

        return ans;
    }
}
