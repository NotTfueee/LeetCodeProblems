package Array;

//File Created by -- > anuragbhatt
//Created On -- > 07/11/23,Tuesday

import java.util.Arrays;

public class EliminateMaximumNumberOfMonsters {

    public static void main(String[] args) {

        int[] dist = {1,3,4};
        int[] speed = {1,1,1};

        System.out.println(eliminateMaximum(dist , speed));

    }

    public static int eliminateMaximum(int[] dist , int[]speed)
    {
        double[] time = new double[dist.length];

        for(int i = 0 ; i < dist.length ; ++i)
        {
            time[i] = (double)dist[i] / speed[i];
        }

        Arrays.sort(time);

        int count = 0  , timePassed = 0;

        for(int i = 0 ; i < time.length ; ++i)
        {

            if(time[i] - timePassed > 0)count++;
            else break;

            timePassed++;
        }

        return count;
    }
}
