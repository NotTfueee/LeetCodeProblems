package Array.SlidingWindow;

import java.util.*;


public class SlidingWindowMaximum {

    public static void main(String[] args)
    {
        int[] a = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(max(a,3)));
    }

    public static int[] max(int[] nums , int k)
    {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> dynArr = new ArrayList<>();

        int start = 0;

        for(int i = 0 ; i < nums.length ; i ++)
        {
            int item = nums[i];

            if(dq.isEmpty())
            {
                dq.addFirst(item);
            }
            else
            {
                if(item > dq.getFirst())
                {
                    dq.clear();
                    dq.addFirst(item);
                }
                else
                {
                    while(item > dq.getLast())
                    {
                        dq.removeLast();
                    }

                    dq.addLast(item);
                }
            }

            if(i-start == k - 1)
            {
                dynArr.add(dq.peekFirst());
                int leftNumber = nums[start];
                if(leftNumber == dq.peekFirst())dq.removeFirst();
                start++;
            }
        }



        int[] ans = new int[dynArr.size()];
        for(int i = 0 ; i < dynArr.size() ; i ++)
        {
            ans[i] = dynArr.get(i);
        }
        return ans;
    }
}
