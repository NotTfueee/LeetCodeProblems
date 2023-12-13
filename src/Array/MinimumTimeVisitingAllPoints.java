package Array;

//File Created by -- > anuragbhatt
//Created On -- > 03/12/23,Sunday

public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) {

        int[][] arr = {{3,2} ,{-2,2}};

        System.out.println(minTimeToVisitAllPoints(arr));
    }

    public static  int minTimeToVisitAllPoints(int[][] points)
    {
        int count = 0 ;

        for(int i = 0 ; i < points.length - 1 ; ++i)
        {
            int[] curr = points[i];
            int[] next = points[i+1];

            /*
             why we are doing this is because , we are checking what is the maximum change we need to make to either x or y
            in order to get to the next point and that maximum value would be the number of minimum steps to move towards the next point
            we are subtracting the next points and the current point and checking the distance between for example if the next points x
            co-ordinates and y co-ordinate are 5 , 6 and the current co-ordinates are 2 , 2 we need to move 3 steps to reach x co-ordinate
             and 4 steps to reach the y co-ordinate we need to move 1 extra step as we would be moving upwards after reaching 5,5
             so we can calculate this by the below formula
             */
            int deltaX = (int)Math.abs(curr[0] - next[0]);
            int deltaY = (int)Math.abs(curr[1] - next[1]);

            count += Math.max(deltaX , deltaY);
        }

        return count;
    }
}
