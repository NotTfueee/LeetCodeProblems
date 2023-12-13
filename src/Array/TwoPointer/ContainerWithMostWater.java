package Array.TwoPointer;

public class ContainerWithMostWater{

    public static void main(String[] args)
    {
        int[] a = {2,3,4,5,18,17,6};
        System.out.println(max(a));
    }

    public static int max(int[] heights)
    {
        int max = 0 , left = 0 , right = heights.length-1;

        while(left < right)
        {
            int area = (right - left) * Math.min(heights[left] ,  heights[right]);
            max = Math.max(max , area);

            if( heights[left] < heights[right])
            {
                left++;
            }
            else right--;
        }

        return max;
    }
}
