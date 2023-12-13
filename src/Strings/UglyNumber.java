package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 28/10/23,Saturday

public class UglyNumber {

    public static void main(String[] args) {

        System.out.println(fun(4 , 3));
    }

    public static int fun(int x , int y )
    {
        if(x == 0 )
            return y;

        return fun(x - 1 , x + y );
    }
}
