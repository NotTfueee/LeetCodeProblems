package Greedy;

import java.util.Arrays;

public class HouseRobber {

    public static void main(String[] args)
    {
        int[] houses = {1,2,3,1};
        System.out.println(rob(houses));
    }

    public static int rob(int[] houses)
    {
        int[] hack = new int[houses.length];

        for(int i = 0 ; i < 2; i ++)
        {
            int sum = houses[i];

            for(int j = 2 ; i+j < hack.length ; j=j+2)
            {
                sum = sum + houses[i+j];
            }

            hack[i] = sum;
        }

        System.out.println(Arrays.toString(hack));
        return Math.max(hack[0] , hack[1]);
    }
}
