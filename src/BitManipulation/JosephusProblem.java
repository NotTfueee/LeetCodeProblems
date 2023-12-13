package BitManipulation;

public class JosephusProblem {

    public static void main (String[] args)
    {
        System.out.println(remainingNumberFinder(11));

        // using bit manipulation
        System.out.println(bitMani(11));
    }

    public static int bitMani(int n)
    {
        int number = (n << 1)+1;

        int mask = powerFinder(number);

        int ans = number ^ ((int)Math.pow(2 , mask));

        return ans;
    }

    public static int powerFinder(int n )
    {
        int count = 0 ;

        double num = (double)n;
        while(num >= 2.0)
        {
            num = num / 2.0;
            count++;
        }

        return count;
    }

    public static int remainingNumberFinder(int n)
    {
        int powerOf2 = powerFinder(n);
        int l =  n - ((int)(Math.pow(2 , powerOf2)));

        int number = (2 * l) + 1;

        return number;
    }
}
