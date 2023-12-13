package Stackss;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args)
    {
        long[] a = {7,8,1,4};
        System.out.println(Arrays.toString(find(a , a.length)));
    }

    public static long[] find(long [] arr , int n )
    {
        var stackElement = new Stack<Long>();
        var stackIndex = new Stack<Integer>();

        long[] ans = new long[n];

        for(int i = 0 ; i < n ; i ++)
        {
            long item = arr[i];

            if(stackElement.isEmpty())
            {
                stackElement.push(item);
                stackIndex.push(i);
                continue;
            }

            while(!stackElement.isEmpty() && item > stackElement.peek())
            {
                stackElement.pop();
                ans[stackIndex.pop()] = item;
            }

            stackElement.push(item);
            stackIndex.push(i);
        }
        while(!stackElement.isEmpty())
        {
            stackElement.pop();
            ans[stackIndex.pop()] = -1;
        }

        return ans;
    }
}
