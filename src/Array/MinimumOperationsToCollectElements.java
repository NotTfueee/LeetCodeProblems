package Array;

//File Created by -- > anuragbhatt
//Created On -- > 30/09/23,Saturday

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MinimumOperationsToCollectElements {

    public static void main(String[] args) {

        var arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(2);

        System.out.println(collect(arr , 2));

    }

    public static int collect(List<Integer> arr , int k )
    {
        var set = new HashSet<Integer>();

        for(int i = 1 ; i <= k ; ++i)
        {
            set.add(i);
        }

        int count = 0;

        for(int i = arr.size()-1 ; i >= 0 ; --i)
        {
            int item = arr.get(i);

            if(!set.isEmpty() && set.contains(item))
            {
                set.remove(item);
            }
            else if(set.isEmpty())break;
            count++;
        }

        return count;
    }
}
