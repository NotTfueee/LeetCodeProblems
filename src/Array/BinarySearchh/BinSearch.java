package Array.BinarySearchh;

public class BinSearch {

    public static void main(String[] args)
    {
        int[] a = {-1,0,3,5,9,12};
        System.out.println(search(a,9));
    }

    public static int search(int[] nums , int target)
    {
        int start = 0 , end = nums.length-1 ;
        int mid = 0;

        while(start <= end)
        {
            mid = (int)Math.floor((start+end)/2);
            if(nums[mid] == target)return mid;
            else if(target < nums[mid])end = mid-1;
            else start = mid+1;
        }

        return -1;
    }
}
