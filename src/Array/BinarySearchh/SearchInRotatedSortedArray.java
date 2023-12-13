package Array.BinarySearchh;

public class SearchInRotatedSortedArray {

    public static void main (String[] args)
    {
        int[] a = {4,5,6,7,0,1,2};
        System.out.println(search(a , 0));
    }

    public static int search(int[] nums , int target)
    {
        int left = 0 , right = nums.length - 1;

        while(left <= right)
        {
            int mid = (left+right)/2;

            if(nums[mid] == target)return mid;
            else if (nums[left] <= nums[mid]) // with this we can check if the elements on the left of the mid are in increasing order or not
            {
               if(target < nums[mid] && target >= nums[left])
               {
                   right = mid-1;
               }
               else left = mid + 1;
            }
            else if(nums[right ] >= nums[mid])
            {
                if(target > nums[mid] && target <= nums[right])
                {
                    left = mid + 1;
                }
                else right = mid - 1;
            }
        }
        return -1;
    }
}
