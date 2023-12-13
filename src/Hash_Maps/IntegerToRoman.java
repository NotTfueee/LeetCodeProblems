package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 05/10/23,Thursday

public class IntegerToRoman {

    public static void main(String[] args) {


        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int n )
    {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


        String ans = "";
        for(int i = 0 ; i < values.length ; ++i)
        {
            while(n >= values[i])
            {
                if(values[i] <= n)
                {
                    n -= values[i];
                    ans += roman[i];
                }
            }
        }

        return ans;
    }
}
