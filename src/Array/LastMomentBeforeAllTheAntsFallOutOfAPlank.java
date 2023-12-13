package Array;

//File Created by -- > anuragbhatt
//Created On -- > 04/11/23,Saturday

public class LastMomentBeforeAllTheAntsFallOutOfAPlank {

    public static void main(String[] args) {

        int[] left = {};
        int[] right = {0,1,2,3,4,5,6,7};

        System.out.println(getLastMoment(7 , left , right));
    }

    public static int getLastMoment(int n, int[] left, int[] right)
    {

        int lmax = Integer.MIN_VALUE , rmin = Integer.MAX_VALUE;

        for(int l : left)
        {
            lmax = Math.max(l , lmax);
        }

        for(int r : right)
        {
            rmin = Math.min(r , rmin);
        }

        if(right.length == 0)
        {
            return lmax;
        }
        else if(left.length == 0 )
        {
            return n - rmin;
        }

        return Math.max(lmax , n - rmin);
    }
}
