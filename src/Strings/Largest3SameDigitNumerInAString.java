package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 04/12/23,Monday

public class Largest3SameDigitNumerInAString {

    public static void main(String[] args) {

        System.out.println(largestGoodInteger("3200014888"));
    }

    public static String largestGoodInteger(String num)
    {
        int max = Integer.MIN_VALUE , count = 1;
        String ans = "";

        for(int i = 1 ; i < num.length() ; ++i)
        {
            char curr = num.charAt(i) , prev = num.charAt(i-1);

            if(curr == prev)count ++;
            else count = 1;

            if(count == 3)
            {
                if(max < curr-'0')
                {
                    max = curr-'0';
                    ans = num.substring(i-3+1 , i+1);
                }

                count = 1;
            }
        }

        return ans;
    }

}
