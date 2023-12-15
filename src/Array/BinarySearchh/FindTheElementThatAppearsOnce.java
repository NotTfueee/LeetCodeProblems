package Array.BinarySearchh;

//File Created by -- > anuragbhatt
//Created On -- > 15/12/23,Friday

public class FindTheElementThatAppearsOnce {

    public static void main(String[] args) {

        int[] arr = {2, 2, 5, 5, 20, 30, 30};
        System.out.println(search(arr , arr.length));
    }

    public static int search(int a[] , int n )
    {
        if(n == 1)return a[0];
        else if(a[0] != a[1])return a[0];
        else if(a[n-1] != a[n-2])return a[n-1];

        int left = 0 , right = n -1;

        while(left <= right)
        {
            int mid = (left + right)/2;

            if(a[mid] != a[mid-1] && a[mid] != a[mid+1])return a[mid];
            else if(a[mid] == a[mid-1])
            {
                /*
                we will check the count of elements on each side of mid if the mid -1 element is same as mid we will break the array
                from left to mid (as mid and mid -1 are same we will keep then in one group) and mid + 1 to right and move towards
                the side which has an odd count because if the count is even there can never be a single element that occurs once and
                all the other element occur twice

                eg == 1 1 2 2 3 4 here the array has 6 element, we can see there are 2 single elements but for odd count of elements
                it is possible
                eg == 11 22 3 44 here the array has 7 elements , so we can have a single element that occurs only once

                we calculate the left count and check if it is even we will check on the right hand side and if not we will check of
                the left hand side and place the right pointer to mid -2 as we have already check mid with mid -1 means that the element
                will lie beyond mid - 2
                 */
                int leftCount = mid - left + 1;
                if(leftCount % 2 == 0)left = mid + 1;
                else right = mid-2;


            }
            else if(a[mid] == a[mid+1])
            {
                int rightCount = right - mid + 1;

                if(rightCount % 2 == 0)right = mid - 1;
                else left = mid + 2 ;
            }
        }

        return -1;
    }
}
