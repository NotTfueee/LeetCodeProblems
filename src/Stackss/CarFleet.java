package Stackss;

import java.util.Arrays;

public class CarFleet {

    public static void main (String[] args)
    {
        int[] p = {6,8};
        int[] s = {3,2};
        System.out.println(fleetFinder(10,p,s));
    }

    public static int fleetFinder(int target , int[] position , int[] speed)
    {
        int ans = 0;
        double slowCar = 0 ;
        double eta = 0;

        /*
        we create a 2d array so that we can sort the array in descending order which means to the order of car which is
        nearest to the finishing line and then we find the distance of each car from the finish line (by doing target - position[i])
         and calculate the eta for each car to take to reach to the finish line

        as we know that the faster car can never overtake or cross the slower car in front of it and will also move with
        the same speed as the slower car which will make a new fleet

        a car is said to be slower if it takes more time to reach the target
        a car is said to be faster if it takes less time to reach the target

        so we check if the eta of the curr car is greater than the car in front of it , it means that the car will never
        meet and the slower car will make a new fleet so we add 1 to the ans and set the slow car as the current eta
        and if the eta of the curr car is lesser than the slow car we do nothing as it merges with the slower car
         */
        int[][] zip = new int[position.length][2];

        for(int i = 0 ; i < position.length ; i ++)
        {
            zip[i][0] = position[i];
            zip[i][1] = speed[i];
        }

        Arrays.sort(zip,(a,b) -> Integer.compare(b[0] , a[0]));

        System.out.println(Arrays.deepToString(zip));

        for(int i = 0 ; i < zip.length ; i ++)
        {
            eta = (double)(target - zip[i][0])/zip[i][1];
            System.out.println(eta);
            if(eta > slowCar)
            {
                ans ++;
                slowCar = eta;
            }

        }
        return ans;
    }
}
