package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 24/12/23,Sunday

public class MinimumChangesToMakeAlternatingBinaryString {

    public static void main(String[] args) {
        System.out.println(min("10"));
    }

    public static int min(String s)
    {
        int n = s.length() , count0 = 0 , count1 = 0;

        for(int i = 0 ; i < n ; ++i)
        {
            char item = s.charAt(i);

            if(i % 2 == 0 )
            {
                if(item != '0')count0++;
            }
            else
            {
                if(item != '1')count0++;
            }
        }

        for(int i = 0 ; i < n ; ++i)
        {
            char item = s.charAt(i);

            if(i % 2 == 0)
            {
                if(item != '1')count1++;
            }
            else
            {
                if(item != '0')count1++;
            }
        }
        return Math.min(count1 , count0);
    }
}
