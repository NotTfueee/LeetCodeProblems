package Stackss;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main (String [] args)
    {
        int[] tps = {89,62,70,58,47,47,46,76,100,70};
        System.out.println(Arrays.toString(temprature(tps)));
    }

    public static int[] temprature(int[] temp)
    {
       int[] out = new int[temp.length];
        Stack<Integer> stackTemp = new Stack<>();
        stackTemp.add(temp[0]);
        Stack<Integer> stackIndex = new Stack<>();
        stackIndex.add(0);

        for(int i = 0 ; i < temp.length ; i++)
        {
            int item = temp[i];

            if(item > stackTemp.peek())
            {
                stackTemp.pop();
                int arrInd = stackIndex.pop();
                out[arrInd] = i - arrInd;

                while(!stackTemp.isEmpty() && item > stackTemp.peek())
                {
                    if(item > stackTemp.peek())
                    {
                        stackTemp.pop();
                        arrInd = stackIndex.pop();
                        out[arrInd] = i-arrInd;
                    }
                }

                stackTemp.push(item);
                stackIndex.push(i);
            }
            else
            {
                stackTemp.push(item);
                stackIndex.push(i);
            }

        }
       return out;
    }
}
