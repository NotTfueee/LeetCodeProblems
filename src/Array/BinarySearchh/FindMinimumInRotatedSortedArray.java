package Array.BinarySearchh;

public class FindMinimumInRotatedSortedArray {

    public static void main (String[] args)
    {
        int[] a = {4,5,6,7,0,1,2};
        System.out.println(min(a));
    }

    public static int min(int[] nums)
    {
        int left = 0 ,  right = nums.length-1 , min = nums[0] , mid = 0;

        while(left < right)
        {

            if(nums[left] < nums[right])
            {
                min = Math.min(min , nums[left]);
                break;
            }

            mid = (left+right)/2;
            min = Math.min(min , nums[mid]);

            if(nums[left] <= nums[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return min;
    }

}
