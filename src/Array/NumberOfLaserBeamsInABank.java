package Array;

//File Created by -- > anuragbhatt
//Created On -- > 03/01/24,Wednesday

public class NumberOfLaserBeamsInABank {

    public static void main(String[] args) {

        String[] bank = {"011001","010100","010100","001010"};

        System.out.println(numberOfBeams(bank));
    }

    public static int numberOfBeams(String[] bank)
    {
        int ans = 0 , prev = 0;

        for(int i = 0 ; i < bank.length ; ++i)
        {
            String s = bank[i];
            int count = 0;
            for(int j = 0 ; j < s.length() ; ++j)
            {
                if(s.charAt(j) == '1')count ++;
            }

            if(i > 0 && i <= bank.length-1)ans += (prev * count);
            if(count != 0) prev = count;
        }

        return ans;
    }
}
