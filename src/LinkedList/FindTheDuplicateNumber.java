package LinkedList;

public class FindTheDuplicateNumber {

    public static void main(String[] args)
    {
        int[] a = {1,3,4,2,2};

        System.out.println(cycle(a));
    }


    public static int cycle(int[] nums)
    {
        int fast = 0 ; int slow = 0 ; int secondSlow = 0 ;

        while(true)
        {
           fast = nums[nums[fast]];
            slow = nums[slow];

            if(slow == fast)
            {
                slow = nums[slow];
                secondSlow = nums[secondSlow];

               while(secondSlow != slow)
               {
                   slow = nums[slow];
                   secondSlow = nums[secondSlow];
               }

               return secondSlow;
            }


        }

    }
}
