package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 07/12/23,Thursday

public class LargestOddNumberInString {

    public static void main(String[] args) {

        System.out.println(largestOddNumber("223124"));

    }

    public static String largestOddNumber(String num)
    {
        // the ans lies in finding the first occurrence of odd digit from the right side of the string

        for(int i = num.length() - 1 ; i >= 0 ; --i)
        {
            char item = num.charAt(i);

            if((item - '0') % 2 != 0 )return num.substring(0 , i + 1);
        }

        return "";
    }
}
