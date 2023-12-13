package Array;

//File Created by -- > anuragbhatt
//Created On -- > 19/11/23,Sunday

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ReductionOperationToMakeTheArrayElementEqual {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,5,6,6,7,8,8};

        System.out.println(reduce(arr));
    }

    public static int reduce(int[] arr)
    {
        int n = arr.length;

        Arrays.sort(arr);
        if(arr[n-1] == arr[0])return 0;

        var map = new HashMap<Integer , Integer>();

        for(int i = 0 ; i < n ; ++i)
        {
            int item = arr[i];
            map.put(item , map.getOrDefault(item , 0 ) + 1);
        }

        var mapArray = new ArrayList<Integer>(map.keySet());
        Collections.sort(mapArray);

        int prevCount = map.get(mapArray.get(mapArray.size()-1)) , count = prevCount;

        for(int i = mapArray.size()-2 ; i >= 1 ; --i)
        {
            int val = map.get(mapArray.get(i)) + prevCount;
            prevCount = val;
            count += prevCount;

        }

        return count ;
    }
}
