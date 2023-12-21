package Array;

//File Created by -- > anuragbhatt
//Created On -- > 21/12/23,Thursday

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public static void main(String[] args) {
        int[][] arr = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};

        System.out.println(maxWidth(arr));
    }

    public static int maxWidth(int[][] points)
    {
        Comparator<int[]> comp = Comparator.comparingInt(a -> a[0]);

        Arrays.sort(points, comp);

        int n = points.length , max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n-1 ; ++i)
        {
            int val = points[i+1][0] - points[i][0];
            max = Math.max(max , val);
        }

        return max;
    }
}
