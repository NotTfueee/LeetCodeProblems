package Queue_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public static void main(String[] args)
    {
        int[] a = {3,2,1,5,6,4};
        System.out.println(kthEle(a,2));
    }


    public static int kthEle(int[] nums , int k )
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < nums.length ; i ++)
        {
            int item = nums[i];
            pq.add(item);
        }

        int i = 0;

        while(i < k-1)
        {
            pq.remove();
            i++;
        }
        return pq.peek();
    }
}
