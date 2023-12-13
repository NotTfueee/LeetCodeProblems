package Array.TwoPointer;

public class TrappingRainWater {

    public static void main(String[] args)
    {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }


    public static int trap(int[] height) {


        int leftMax = 0, rightMax = 0 , ans = 0;

        int[] rightMaxTracker = new int[height.length];

        for(int i = height.length-1 ; i >= 0 ; i-- )
        {
            rightMaxTracker[i] = rightMax;
            rightMax = Math.max(rightMax,height[i]);
        }

        for (int i = 0; i < height.length; i++)
        {
            int item = height[i];
            rightMax =  rightMaxTracker[i];

            int val = Math.min(leftMax , rightMax)-item;

            if(val > 0)ans += val;

            leftMax = Math.max(leftMax , item);
        }
        return ans;
    }


}
