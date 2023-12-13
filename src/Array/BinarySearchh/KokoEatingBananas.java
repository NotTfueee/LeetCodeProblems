package Array.BinarySearchh;

public class KokoEatingBananas {

    public static void main(String[] args)
    {
        int[] a = {805306368,805306368,805306368};
        System.out.println(banana(a , 1000000000));
    }

    public static int banana(int[] piles , int h )
    {
        /*
        1st point ---->
        we want to find the min eating rate of koko so that she can finish all the piles of banana within h hrs
        i know that if the hrs are less than the array size then it will  never be possible to eat all the piles of banana in
        less than h hrs ,, let us consider that h is 4 the no of hrs that the guards will not be there to guard
        and the no of piles are 5 whatever speed koko chooses to eat at she would have to wait each time after finishing one pile
        and there are 5 piles so the minimum hrs needed for koko to finish all the piles will always be greater than h hrs i.e 5hrs min

        2nd point ---->
         if koko chooses to eat at the rate of the largest pile then the hrs she would take to finish all the piles would be
         equal to the array size
         for eg [30, 20 , 11, 12, 23] if koko eats at the speed of 30 bananas per hour she would finish each pile in 1 hr and
         n piles in n hrs

         3rd point ---->
         the maximum speed at which koko can eat bananas will be the size of the largest pile in the array right which will give
         the minimum hours also
         so we can try all the numbers in between 1 to maximum pile size to find the minimum speed to eat bananas so that koko can
         finish all the piles

         4th point ---->
         we can make an array from 1 to max pile size and apply binary search and check if taking mid of the array as our speed
         of eating leads to more hours than the h hrs if so we need to increase the speed look on the right side of the array and
         if not we need to check if we can further reduce the speed and eat the bananas at more time but less than h hrs
         */


        int left = 1 , right = 1 ;

        for(int val : piles)
        {
            right = Math.max(right , val);
        }

        int min = right;

        while(left <= right)
        {
            int mid = (left + right)/2 ;

            long hours = 0;

            for(int val : piles)
            {
                hours += (int)(Math.ceil((double)val/mid));
            }

            if(hours <= h )
            {
                min = Math.min(min , mid);
                right = mid-1;
            }
            else left = mid+1;
        }

        return min;
    }
}
